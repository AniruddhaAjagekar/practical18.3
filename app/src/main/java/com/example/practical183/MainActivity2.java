package com.example.practical183;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt1,txt2;
    int num,fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        num = intent.getIntExtra("Num",0);
        fact = intent.getIntExtra("Fact",0);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        txt1.setText("Number="+num);
        txt2.setText("Factorial="+fact);
    }
}