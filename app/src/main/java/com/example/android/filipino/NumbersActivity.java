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

        ArrayList<Word> numbers = new ArrayList<>();

        numbers.add(new Word("one", "isa", 1));
        numbers.add(new Word("two", "dalawa", 2));
        numbers.add(new Word("three", "tatlo", 3));
        numbers.add(new Word("four", "apat", 4));
        numbers.add(new Word("five", "lima", 5));
        numbers.add(new Word("six", "anim", 6));
        numbers.add(new Word("seven", "pito", 7));
        numbers.add(new Word("eight", "walo", 8));
        numbers.add(new Word("nine", "siyam", 9));
        numbers.add(new Word("ten", "sampu", 10));

        WordAdapter adapter = new WordAdapter(this, numbers);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}