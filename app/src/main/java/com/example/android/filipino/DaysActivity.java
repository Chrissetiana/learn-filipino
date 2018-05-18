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

        ArrayList<Word> days = new ArrayList<>();

        days.add(new Word("monday", "lunes", R.mipmap.ic_launcher));
        days.add(new Word("tuesday", "martes", R.mipmap.ic_launcher));
        days.add(new Word("wednesday", "miyerkules", R.mipmap.ic_launcher));
        days.add(new Word("thursday", "huwebes", R.mipmap.ic_launcher));
        days.add(new Word("friday", "biyernes", R.mipmap.ic_launcher));
        days.add(new Word("saturday", "sabado", R.mipmap.ic_launcher));
        days.add(new Word("sunday", "linggo", R.mipmap.ic_launcher));

        WordAdapter adapter = new WordAdapter(this, days);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}