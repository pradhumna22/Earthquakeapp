package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class Earhquake_Adaptor extends ArrayAdapter<Earthquake> {

    public  Earhquake_Adaptor(Context context, List<Earthquake>earthquakes){
        super(context,0,earthquakes);
    }
    public View getView(int postion, View connectView, ViewGroup parent){
        View listView=connectView;
        if(listView ==null){
            listView= LayoutInflater.from(getContext()).inflate(
                R.layout.earthquake_list_item,parent,false);
            }

        Earthquake currentearthquake=getItem(postion);
        TextView magnitudeView =(TextView)listView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentearthquake.getMangnitude());

        TextView locationView =(TextView)listView.findViewById(R.id.location);
        locationView.setText(currentearthquake.getmLocation());

        TextView dateView =(TextView)listView.findViewById(R.id.date);
        magnitudeView.setText(currentearthquake.getmDate());

        return listView; }
    }

