package com.summary;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView mWbTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
    }

    private void initView() {
        mWbTest = findViewById(R.id.wb_test);

        mWbTest.getSettings().setJavaScriptEnabled(true);
        mWbTest.loadUrl("file:///android_asset/test2.html");
    }
}
