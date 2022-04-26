package com.example.phuongapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewContactInfoActivity_main extends Activity {
    TextView tVname, tVemail, tVproject;
    Button finishbtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        tVname = (TextView) findViewById(R.id.tVname);
        tVemail = (TextView) findViewById(R.id.tVEmail);
        tVproject = (TextView) findViewById(R.id.tVproject);

        finishbtn = (Button) findViewById(R.id.buttonfinish);
        finishbtn.setOnClickListener(clickfinishbtn);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("namekey");
        String email = bundle.getString("mailkey");
        String project = bundle.getString("projectkey");

        tVname.setText(name);
        tVemail.setText(email);
        tVproject.setText(project);
    }

    private View.OnClickListener clickfinishbtn = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();

        }
    };


}
