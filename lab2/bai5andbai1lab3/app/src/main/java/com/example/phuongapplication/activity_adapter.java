package com.example.phuongapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class activity_adapter extends AppCompatActivity {
Button btn_add, btn_sort;
ListView lv_personList;
person_list_adapter person;
use_adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        btn_add = findViewById(R.id.btn_add);
        btn_sort = findViewById(R.id.btn_sort);
        lv_personList = findViewById(R.id.lv_person);

        person = new person_list_adapter();

        adapter = new use_adapter (activity_adapter.this, person);
        lv_personList.setAdapter(adapter);

    }
}