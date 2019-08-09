package com.hamdani.myuixdlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         LinearLayout linearLayout = (LinearLayout)findViewById(R.id.btn1);
         linearLayout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,zikir.class);
                 startActivity(intent);
             }
         });
        LinearLayout linear2 = (LinearLayout)findViewById(R.id.btn2);
        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,tahlil.class);
                startActivity(intent);
            }
        });
        LinearLayout linear3 = (LinearLayout)findViewById(R.id.btn3);
        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Yasin.class);
                startActivity(intent);
            }
        });
        LinearLayout linear4 = (LinearLayout)findViewById(R.id.btn4);
        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Doa.class);
                startActivity(intent);
            }
        });

        //conter
        LinearLayout linear5 = (LinearLayout)findViewById(R.id.btn5);
        linear5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Conter.class);
                startActivity(intent);
            }
        });
        //catatan agenda
        LinearLayout linear6 = (LinearLayout)findViewById(R.id.btn6);
        linear6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Catatan_Agenda.class);
                startActivity(intent);
            }
        });
    }
}
