package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("black", "itim", 1));
        colors.add(new Word("blue", "asul", 2));
        colors.add(new Word("brown", "tsokolate", 3));
        colors.add(new Word("green", "berde", 4));
        colors.add(new Word("orange", "kahel", 5));
        colors.add(new Word("pink", "rosas", 6));
        colors.add(new Word("red", "pula", 7));
        colors.add(new Word("violet", "lila", 8));
        colors.add(new Word("yellow", "dilaw", 9));
        colors.add(new Word("white", "puti", 10));
        // colors.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
