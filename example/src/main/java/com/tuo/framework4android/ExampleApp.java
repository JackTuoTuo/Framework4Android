package com.tuo.framework4android;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.tuo.tuo.app.Tuo;
import com.tuo.tuo.ec.icon.FontECModule;
/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2017/12/05
 *     desc   : Application 配置项目参数
 *     version: 1.0
 * </pre>
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Tuo.init(this)
                .withApiHost("http://127.0.0.1")
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontECModule())
                .configure();
    }
}
