package com.example.corvidw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Contacts extends AppCompatActivity {
    Button bna;
    WebView vb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        bna = (Button) findViewById(R.id.btnHome_contacts);
        vb = (WebView) findViewById(R.id.nm);

        WebSettings webSettings = vb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        vb.loadUrl("https://covid19.ncdc.gov.ng/contact");
        vb.setWebViewClient(new WebViewClient());

        bna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Contacts.this, Corvid.class);
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