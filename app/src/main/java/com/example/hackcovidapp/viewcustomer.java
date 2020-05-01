package com.example.hackcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class viewcustomer extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewcustomer);
        tv1=findViewById(R.id.textView1);
        tv2=findViewById(R.id.textview2);
        tv3=findViewById(R.id.textview3);
        tv4=findViewById(R.id.textview4);

    }
}
