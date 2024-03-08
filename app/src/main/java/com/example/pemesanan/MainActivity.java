package com.example.pemesanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

private LinearLayout    layout1, layout2, layout3, layout4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1=findViewById(R.id.g4);
        layout2=findViewById(R.id.g11);
        layout3=findViewById(R.id.g18);
        layout4=findViewById(R.id.g15);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ShoesActivity.class));
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BagActivity.class));
            }
        });

        View.OnClickListener caseActivityClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CaseActivity.class));
            }
        };
        layout2.setOnClickListener(caseActivityClickListener);
        layout4.setOnClickListener(caseActivityClickListener);



    }
}