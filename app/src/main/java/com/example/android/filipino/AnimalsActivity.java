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

        ArrayList<Words> animals = new ArrayList<>();

        animals.add(new Words("dog", "aso", 1));
        animals.add(new Words("cat", "pusa", 2));
        animals.add(new Words("fish", "isda", 3));
        animals.add(new Words("bird", "ibon", 4));

        WordAdapter adapter = new WordAdapter(this, animals);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
