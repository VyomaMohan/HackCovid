package com.example.hackcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class viewcustomer extends AppCompatActivity {
    EditText regShopNameField;
    TextView shopname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewcustomer);

        Intent i=getIntent();


        String regShopName=i.getStringExtra("shopname");


        shopname=findViewById(R.id.shopname);
        shopname.setText(regShopName);

        //regShopNameField=findViewById(R.id.registershopname);
        //String regShopName=regShopNameField.getText().toString();

        Context context=viewcustomer.this;
        DBHelper dbHelper=new DBHelper(context);
        SQLiteDatabase db=dbHelper.getReadableDatabase();

        ArrayList orders=new ArrayList<OrderFormat>();

        String selection =  "storeName = ?";
        String[] selectionArgs = { regShopName };

        Cursor cursor=db.query(
                "StoreOrder",null,selection,selectionArgs,null,null,null
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

        ListView listView = (ListView) findViewById(R.id.shopkeeperlist);
        listView.setAdapter(adapter);
    }
}
