package com.tuo.tuo.app;

import android.content.Context;

import java.util.HashMap;

/**
 * @describe TODO
 * 作者：Tuo on 2017/12/4 11:18
 * 邮箱：839539179@qq.com
 */

public final class Tuo {


    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }


    /**
     * 从配置类中获取 配置信息的HashMap
     *
     * @return HashMap<String, Object>
     */
    private static HashMap<String, Object> getConfigurations() {
        return Configurator.getInstance().getTuoConfigs();
    }

    public static Context getApplicationContext() {
        return (Context) getConfigurations().get(ConfigType.APPLICATION_CONTEXT.name());
    }


}
