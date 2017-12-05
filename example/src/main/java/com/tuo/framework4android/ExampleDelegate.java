package com.tuo.framework4android;

import android.os.Bundle;
import android.view.View;

import com.tuo.tuo.delegates.TuoDelegate;

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2017/12/05
 *     desc   : 单 Activity 多 Fragment 中的 多Fragment 的根 Fragment
 *     version: 1.0
 * </pre>
 */

public class ExampleDelegate extends TuoDelegate {

    @Override
    public Object setLayout() {

        return R.layout.delegate_example;
    }

    @Override
    protected void onBindView(Bundle savedInstanceState, View rootView) {

    }
}
