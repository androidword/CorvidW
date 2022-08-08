package com.example.corvidw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Check extends AppCompatActivity {

     Button btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
         btn4 = (Button) findViewById(R.id.btn_yes);
         btn5 = (Button) findViewById(R.id.btn_no);
         btn6 = (Button)findViewById(R.id.checkHome);

         btn4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(getApplicationContext(), "You Are Safe, Please, Always Take The Preventive Measure", Toast.LENGTH_SHORT).show();
             }
         });

         btn5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(getApplicationContext(), "Contact Your Doctor, You Might Be Exposed To this Virus", Toast.LENGTH_SHORT).show();
             }
         });

         btn6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(Check.this, Corvid.class);
                 startActivity(intent);
             }
         });
    }

}