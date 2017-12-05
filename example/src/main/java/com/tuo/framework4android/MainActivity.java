package com.tuo.framework4android;


import android.os.Bundle;
import android.widget.Toast;

import com.tuo.tuo.app.Tuo;

import me.yokeyword.fragmentation.SupportActivity;

public class MainActivity extends SupportActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(Tuo.getApplicationContext(), "app", Toast.LENGTH_LONG).show();

    }
}
