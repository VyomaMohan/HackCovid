package com.example.hackcovidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ordersCustomAdapter extends ArrayAdapter<OrderFormat> {
    public ordersCustomAdapter(Context context, ArrayList<OrderFormat> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        OrderFormat order = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.order_listview_item, parent, false);
        }
        // Lookup view for data population
        TextView phoneNum = (TextView) convertView.findViewById(R.id.listview_item_phone);
        TextView itemsReq = (TextView) convertView.findViewById(R.id.listview_item_req);
        TextView datentime=(TextView)convertView.findViewById(R.id.listview_item_date);
        // Populate the data into the template view using the data object
        phoneNum.setText(order.getPhonenum());
        itemsReq.setText(order.getItemsReq());
        datentime.setText(order.getDatetime());
        // Return the completed view to render on screen
        return convertView;
    }

}
