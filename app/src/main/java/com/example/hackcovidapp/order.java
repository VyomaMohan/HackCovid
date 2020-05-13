package com.example.hackcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class order extends AppCompatActivity {
TextView tv1,tv2;
Button bt1;
EditText phoneNum,storeName, items,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        bt1=findViewById(R.id.bt1);
        phoneNum=findViewById(R.id.form_phone_num);
        storeName=findViewById(R.id.form_store_name);
        items=findViewById(R.id.form_items);
        date=findViewById(R.id.form_dt);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context=order.this;
                DBHelper dbHelper = new DBHelper(context);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                ContentValues order=new ContentValues();
                order.put("phoneNumber",phoneNum.getText().toString());
                order.put("storeName",storeName.getText().toString());
                order.put("items",items.getText().toString());
                order.put("date",date.getText().toString());

                long newRowId = db.insert("StoreOrder", null, order);

                //Intent intent=new Intent(order.this,listview.class);
                //startActivity(intent);
                Log.i("order click method","Inserted to DB");
            }
        });
    }
}
