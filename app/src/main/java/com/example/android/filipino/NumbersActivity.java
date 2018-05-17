package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Words> numbers = new ArrayList<>();

        numbers.add(new Words("one", "isa", 1));
        numbers.add(new Words("two", "dalawa", 2));
        numbers.add(new Words("three", "tatlo", 3));
        numbers.add(new Words("four", "apat", 4));
        numbers.add(new Words("five", "lima", 5));
        numbers.add(new Words("six", "anim", 6));
        numbers.add(new Words("seven", "pito", 7));
        numbers.add(new Words("eight", "walo", 8));
        numbers.add(new Words("nine", "siyam", 9));
        numbers.add(new Words("ten", "sampu", 10));

        WordAdapter adapter = new WordAdapter(this, numbers);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}