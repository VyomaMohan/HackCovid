package com.example.hackcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class activity_customerorders extends AppCompatActivity {
Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerorders);

        bt2=findViewById(R.id.button2);

        Intent i=new Intent();
        String custPh=i.getStringExtra("phoneNumber");

        Context context=activity_customerorders.this;
        DBHelper dbHelper=new DBHelper(context);
        SQLiteDatabase db=dbHelper.getReadableDatabase();
        dbHelper.onCreate(db);

        ArrayList orders=new ArrayList<OrderFormat>();

        //String selection =  "phoneNumber = ?";
       // String[] selectionArgs = { custPh };

        Cursor cursor=db.query(
           "StoreOrder",null,null,null,null,null,null
        );

        while(cursor.moveToNext()) {
            String phNum = cursor.getString(cursor.getColumnIndexOrThrow("phoneNumber"));
            String stName=cursor.getString(cursor.getColumnIndexOrThrow("storeName"));
            String itreq=cursor.getString(cursor.getColumnIndexOrThrow("items"));
            String dt=cursor.getString(cursor.getColumnIndexOrThrow("date"));

            orders.add(new OrderFormat(phNum,stName,itreq,dt));

            //Log.i("From read", itemId);
        }
        cursor.close();

        ordersCustomAdapter adapter=new ordersCustomAdapter(this,orders);

        ListView listView = (ListView) findViewById(R.id.customersideorders);
        listView.setAdapter(adapter);


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity_customerorders.this,order.class);
                startActivity(intent);
            }
        });
    }
}
