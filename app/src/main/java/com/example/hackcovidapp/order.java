package com.example.hackcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class order extends AppCompatActivity {
TextView tv1,tv2;
Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView1);
        bt1=findViewById(R.id.bt1);

    }
}
