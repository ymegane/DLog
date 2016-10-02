package com.github.ymegane.android.dlog.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.ymegane.android.dlog.DLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DLog.d("test");

        doSomething();
    }

    private void doSomething() {
        DLog.printMethod();
    }
}
