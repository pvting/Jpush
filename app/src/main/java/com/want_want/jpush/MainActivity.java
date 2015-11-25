package com.want_want.jpush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 1.实现基本推送
 * 2.点击推送消息，进入详细页面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
