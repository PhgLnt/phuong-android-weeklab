package com.example.phuongapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText txtName, txtEmail, txtProject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        txtName = (EditText) findViewById(R.id.editTextTextPersonName);
        txtEmail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        txtProject = (EditText) findViewById(R.id.editTextProjectName);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iGetContactInfo = new Intent(getApplicationContext(), ViewContactInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("namekey", txtName.getText().toString());
                bundle.putString("mailkey", txtEmail.getText().toString());
                bundle.putString("projectkey", txtProject.getText().toString());
                iGetContactInfo.putExtras(bundle);
                startActivity(iGetContactInfo);


            }
        });
    }

}
