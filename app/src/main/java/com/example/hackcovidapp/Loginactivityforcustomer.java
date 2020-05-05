package com.example.hackcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Loginactivityforcustomer extends AppCompatActivity {
EditText et1,et2;
Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivityforcustomer);
        et1=findViewById(R.id.editText1);
        et2=findViewById(R.id.editText2);
        bt1=findViewById(R.id.button1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginactivityforcustomer.this,activity_customerorders.class);
                startActivity(intent);
            }
        });

    }
}
