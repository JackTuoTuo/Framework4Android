package com.tuo.framework4android;


import com.tuo.tuo.activities.ProxyActivity;
import com.tuo.tuo.delegates.TuoDelegate;

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2017/12/05
 *     desc   : 单 Activity 多 Fragment 中的 单 Activity
 *     version: 1.0
 * </pre>
 */
public class ExampleActivity extends ProxyActivity {

    @Override
    public TuoDelegate setRootDelegate() {
        return new ExampleDelegate();
    }

}
