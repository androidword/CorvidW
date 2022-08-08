package com.example.corvidw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Corvid extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corvid);
        b1 = ( Button) findViewById(R.id.btn_def);
        b2 = ( Button) findViewById(R.id.btn_exp);
        b3 = ( Button) findViewById(R.id.btn_con);
        b4 = ( Button) findViewById(R.id.btn_vac);
        b5 = ( Button) findViewById(R.id.btn_record);
        b6 = ( Button) findViewById(R.id.btn_report);
        b7 = ( Button) findViewById(R.id.btn_logout);
        b8 = ( Button) findViewById(R.id.btn_feedback);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Corvid.this, Definition.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Corvid.this, Dangerious.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Corvid.this, Prevention.class);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please Turn on Your Network Connection", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Corvid.this, Record.class);
                startActivity(intent);

            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Corvid.this, Contacts.class);
                startActivity(intent);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Corvid.this, Login.class);
                startActivity(intent);

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sh = new Intent(Intent.ACTION_SEND);
                sh.setType("text/plain");
                s = "https://www.facebook.com/Ebsuvilla/";
                sh.putExtra(Intent.EXTRA_TEXT, s);
                sh.setPackage("com.facebook.katana");
                startActivity(sh);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Corvid.this, Check.class);
                startActivity(intent);
            }
        });

    }


}