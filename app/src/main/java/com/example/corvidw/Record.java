package com.example.corvidw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Record extends AppCompatActivity {

    WebView vb;
    Button bnq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        bnq = (Button)findViewById(R.id.btn_home_records);
        vb = (WebView) findViewById(R.id.bn);

        WebSettings webSettings = vb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        vb.loadUrl("https://covid19.ncdc.gov.ng/");
        vb.setWebViewClient(new WebViewClient());

        bnq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Record.this, Corvid.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public  void onBackPressed(){
        if (vb.canGoBack()){
            vb.goBack();

        }else{
            super.onBackPressed();
        }
    }
}