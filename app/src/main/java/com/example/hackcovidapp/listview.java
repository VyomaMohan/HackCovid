package com.example.hackcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class listview extends AppCompatActivity {
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;
    private EditText et1;
    private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        String[] item={"item1","item2","item3 ","item4","item5"} ;
        ListView simpleList = findViewById(R.id.simpleListView);
        arrayList=new ArrayList<>(Arrays.asList(item));
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, arrayList);
        simpleList.setAdapter(arrayAdapter);
        et1=findViewById(R.id.et1);
        bt1=findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ak=et1.getText().toString();
                arrayList.add(ak);
                arrayAdapter.notifyDataSetChanged();
                et1.setText("");
            }
        });

    }
}
