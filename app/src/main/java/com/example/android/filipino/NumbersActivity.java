package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Words> num = new ArrayList<>();

        num.add(new Words("one", "isa", 1));
        num.add(new Words("two", "dalawa", 2));
        num.add(new Words("three", "tatlo", 3));
        num.add(new Words("four", "apat", 4));
        num.add(new Words("five", "lima", 5));
        num.add(new Words("six", "anim", 6));
        num.add(new Words("seven", "pito", 7));
        num.add(new Words("eight", "walo", 8));
        num.add(new Words("nine", "siyam", 9));
        num.add(new Words("ten", "sampu", 10));

        WordAdapter adapter = new WordAdapter(this, num);
        ListView listView = findViewById(R.id.list_numbers);
        listView.setAdapter(adapter);
    }
}