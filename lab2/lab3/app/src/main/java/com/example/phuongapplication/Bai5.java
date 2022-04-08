package com.example.phuongapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.logging.Handler;

public class Bai5 extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);

        btn = (Button) findViewById(R.id.buttonShowme);
        btn.setOnClickListener(clickbtnShowme);

    }
    private View.OnClickListener clickbtnShowme = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent;
     //        intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+84)123456789"));
//             intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)123456789"));
//             intent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
 //              intent = new Intent(Intent.ACTION_EDIT,Uri.parse("content://contacts/people/1"));
//               intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:5551234"));
//               intent.putExtra("sms_body", "You are the best");
             intent = new Intent(AlarmClock.ACTION_SET_ALARM);
//            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);

            //intent = new Intent(AlarmClock.ACTION_SET_TIMER);
           // if (intent.resolveActivity(getPackageManager()) != null) {
             //   startActivity(intent);}

//            Intent myIntent = new Intent();
//            myIntent.setType("image/pictures/*");
//            myIntent.setAction(Intent.ACTION_GET_CONTENT);
//            //startActivity(myIntent);
//            Intent myActivity2 = new Intent("android.intent.action.MUSIC_PLAYER");
//            //startActivity(myActivity2);
//            String url = "http://maps.google.com/maps?"+
//                    "saddr=9.938083,-84.054430&daddr=9.926392,-84.055964";
//             intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));





        }




    };


}