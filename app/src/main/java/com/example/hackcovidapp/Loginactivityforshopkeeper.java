package com.example.hackcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Loginactivityforshopkeeper extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivityforshopkeeper);
        et1=findViewById(R.id.registershopname);
        et2=findViewById(R.id.editText1);
        et3=findViewById(R.id.editText2);
        et4=findViewById(R.id.editText3);
        bt1=findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loginactivityforshopkeeper.this,viewcustomer.class);
                intent.putExtra("shopname",et1.getText().toString());
                startActivity(intent);
            }
        });
    }
}
