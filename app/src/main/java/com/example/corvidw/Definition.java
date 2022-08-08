package com.example.corvidw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Definition extends AppCompatActivity {
     Button  bl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);
         bl1 = ( Button) findViewById(R.id.btn_home);

         bl1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(Definition.this, Corvid.class);
                 startActivity(intent);
             }
         });
    }
}