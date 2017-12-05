package com.tuo.tuo.app;

import com.joanzapata.iconify.IconFontDescriptor;
import com.joanzapata.iconify.Iconify;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @describe 一个单例  整个项目的配置类
 * 作者：Tuo on 2017/12/4 14:19
 * 邮箱：839539179@qq.com
 */

public class Configurator {

    /**
     * 存储 整个项目的配置信息
     */
    private static final HashMap<String, Object> TUO_CONFIGS = new HashMap<>();

    private static final ArrayList<IconFontDescriptor> ICONS = new ArrayList<>();


    private Configurator() {
        TUO_CONFIGS.put(ConfigType.CONFIG_READ.name(), false);
    }

    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }

    /**
     * 提供静态方法 返回这个配置类
     *
     * @return Configurator
     */
    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }


    final HashMap<String, Object> getTuoConfigs() {
        return TUO_CONFIGS;
    }


    public final Configurator withApiHost(String host) {
        TUO_CONFIGS.put(ConfigType.APP_HOST.name(), host);
        return this;
    }


    private void initIcons() {
        if (ICONS.size() > 0) {
            final Iconify.IconifyInitializer initializer = Iconify.with(ICONS.get(0));
            for (int i = 1; i < ICONS.size(); i++) {
                initializer.with(ICONS.get(i));
            }
        }
    }

    public final Configurator withIcon(IconFontDescriptor descriptor) {
        ICONS.add(descriptor);
        return this;
    }


    /**
     * 配置的最后一个方法 代表配置完成 设置为 true
     */
    public final void configure() {
        initIcons();
        TUO_CONFIGS.put(ConfigType.CONFIG_READ.name(), true);
    }


    /**
     * 检查 配置是否完成
     */
    private void checkConfiguration() {
        final boolean isReady = (boolean) TUO_CONFIGS.get(ConfigType.CONFIG_READ.name());
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready,call configure");
        }
    }

    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key) {
        checkConfiguration();
        return (T) TUO_CONFIGS.get(key.name());
    }


}
