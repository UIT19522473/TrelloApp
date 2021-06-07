package com.example.trelloreal.Event;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.EventDay;
import com.example.trelloreal.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

//        List<EventDay> events = new ArrayList<>();
//
//        Calendar calendar = Calendar.getInstance();
//        Calendar calendar1 = Calendar.getInstance();
//
//        calendar1.set(2021,5,7);
//
//       // events.add(new EventDay(calendar, R.drawable.ic_baseline_add_24));
////or
//       // events.add(new EventDay(calendar, new Drawable()));
////or if you want to specify event label color
//        events.add(new EventDay(calendar, R.drawable.ic_baseline_add_24, Color.parseColor("#228B22")));
//
//        events.add(new EventDay(calendar1, R.drawable.ic_baseline_add_24, Color.parseColor("#228B22")));
//
//
//        CalendarView calendarView = (CalendarView) findViewById(R.id.cldTest);
//        calendarView.setEvents(events);




    }
}