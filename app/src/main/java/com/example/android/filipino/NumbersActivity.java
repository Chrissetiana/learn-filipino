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

        numbers.add(new Word("one", "isa", R.mipmap.ic_launcher));
        numbers.add(new Word("two", "dalawa", R.mipmap.ic_launcher));
        numbers.add(new Word("three", "tatlo", R.mipmap.ic_launcher));
        numbers.add(new Word("four", "apat", R.mipmap.ic_launcher));
        numbers.add(new Word("five", "lima", R.mipmap.ic_launcher));
        numbers.add(new Word("six", "anim", R.mipmap.ic_launcher));
        numbers.add(new Word("seven", "pito", R.mipmap.ic_launcher));
        numbers.add(new Word("eight", "walo", R.mipmap.ic_launcher));
        numbers.add(new Word("nine", "siyam", R.mipmap.ic_launcher));
        numbers.add(new Word("ten", "sampu", R.mipmap.ic_launcher));

        WordAdapter adapter = new WordAdapter(this, numbers);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}