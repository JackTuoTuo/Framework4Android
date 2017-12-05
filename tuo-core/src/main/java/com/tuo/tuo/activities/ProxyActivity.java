package com.tuo.tuo.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.ContentFrameLayout;

import com.tuo.tuo.R;
import com.tuo.tuo.delegates.TuoDelegate;

import me.yokeyword.fragmentation.SupportActivity;

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2017/12/05
 *     desc   :
 *     version: 1.0
 * </pre>
 */


public abstract class ProxyActivity extends SupportActivity {

    public abstract TuoDelegate setRootDelegate();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContainer(savedInstanceState);
    }

    private void initContainer(@Nullable Bundle savedInstanceState) {
        final ContentFrameLayout container = new ContentFrameLayout(this);
        container.setId(R.id.delegate_container);
        setContentView(container);
        if (null == savedInstanceState) {
            loadRootFragment(R.id.delegate_container, setRootDelegate());
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
        System.runFinalization();
    }
}
