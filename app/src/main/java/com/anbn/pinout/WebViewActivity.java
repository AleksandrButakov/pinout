package com.anbn.pinout;

import static com.anbn.pinout.MainActivity.url;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    WebView web;

    // нарисуем экран
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        // для стрелки назад в ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        web = findViewById(R.id.webView);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new Callback());
        web.loadUrl(url);
    }

    // для стрелки назад в ActionBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // для стрелки назад в ActionBar
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    // метод нажатия на кнопку
    public void onClickButtonWebViewActivity(View v) {
        // возврат на предыдущий activity
        onBackPressed();
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }


    }


}

