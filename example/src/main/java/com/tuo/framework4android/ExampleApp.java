package com.tuo.framework4android;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.tuo.tuo.app.Tuo;
import com.tuo.tuo.ec.icon.FontECModule;

/**
 * @describe TODO
 * 作者：Tuo on 2017/12/4 11:19
 * 邮箱：839539179@qq.com
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
