package com.example.practical183;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button btn;
    int fact = 1;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= findViewById(R.id.e1);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go();
            }
        });
    }
    public void go(){
        num = Integer.parseInt(e1.getText().toString().trim());
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        navigate();
    }
    public void navigate(){
        Intent intent= new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("Fact",fact);
        intent.putExtra("Num",num);
        startActivity(intent);
    }
}