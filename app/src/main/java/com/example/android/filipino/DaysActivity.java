package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DaysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Words> days = new ArrayList<>();

        days.add(new Words("monday", "lunes", 1));
        days.add(new Words("tuesday", "martes", 2));
        days.add(new Words("wednesday", "miyerkules", 3));
        days.add(new Words("thursday", "huwebes", 4));
        days.add(new Words("friday", "biyernes", 5));
        days.add(new Words("saturday", "sabado", 6));
        days.add(new Words("sunday", "linggo", 7));

        WordAdapter adapter = new WordAdapter(this, days);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}