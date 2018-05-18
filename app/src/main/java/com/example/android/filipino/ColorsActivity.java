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

        colors.add(new Word("black", "itim", R.mipmap.ic_launcher));
        colors.add(new Word("blue", "asul", R.mipmap.ic_launcher));
        colors.add(new Word("brown", "tsokolate", R.mipmap.ic_launcher));
        colors.add(new Word("green", "berde", R.mipmap.ic_launcher));
        colors.add(new Word("orange", "kahel", R.mipmap.ic_launcher));
        colors.add(new Word("pink", "rosas", R.mipmap.ic_launcher));
        colors.add(new Word("red", "pula", R.mipmap.ic_launcher));
        colors.add(new Word("violet", "lila", R.mipmap.ic_launcher));
        colors.add(new Word("yellow", "dilaw", R.mipmap.ic_launcher));
        colors.add(new Word("white", "puti", R.mipmap.ic_launcher));
        // colors.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
