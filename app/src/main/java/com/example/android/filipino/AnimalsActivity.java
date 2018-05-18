package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> animals = new ArrayList<>();

        animals.add(new Word("dog", "aso", 1));
        animals.add(new Word("cat", "pusa", 2));
        animals.add(new Word("fish", "isda", 3));
        animals.add(new Word("bird", "ibon", 4));

        WordAdapter adapter = new WordAdapter(this, animals);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
