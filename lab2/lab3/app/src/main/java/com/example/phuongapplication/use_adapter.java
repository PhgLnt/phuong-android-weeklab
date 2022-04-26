package com.example.phuongapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


public class use_adapter extends BaseAdapter {
    Activity mActivity;
    person_list_adapter per;



    @Override
    public int getCount() {
        return per.getPersonList().size();
    }

    @Override
    public Object getItem(int i) {
        return per.getPersonList().get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       View onePerson;
        LayoutInflater inflater =(LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        onePerson = inflater.inflate(R.layout.adapter_item,viewGroup,false);
        


        return null;
    }
}
