package com.example.lab4;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity {
        private TimePicker tp;
        private Button btn_set,btn_cancel;
        AlarmManager alarmManager;
        PendingIntent pt;
        Calendar calendar;
        Intent intent;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_alarm);
                btn_set = findViewById(R.id.set_alarm);
                tp = findViewById(R.id.time);
                btn_cancel=findViewById(R.id.cancel_alarm);
                calendar = calendar.getInstance();
                alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                intent = new Intent(AlarmActivity.this, Alarm.class);
        }
        public void setAlarm(View view)
        {
                calendar.set(Calendar.HOUR_OF_DAY,tp.getCurrentHour());
                calendar.set(Calendar.MINUTE, tp.getCurrentMinute());
                int hour = tp.getCurrentHour();
                int min = tp.getCurrentMinute();
                pt = PendingIntent.getBroadcast(this,0, intent,PendingIntent.FLAG_UPDATE_CURRENT );
                alarmManager.set(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pt);
                Toast.makeText(this,"Your Alarm is Set",Toast.LENGTH_LONG).show();

        }
        public  void cancelAlarm(View view)
        {
                pt.cancel();
                Toast.makeText(this,"Your Alarm is Cancel",Toast.LENGTH_LONG).show();
        }


}
