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

        ArrayList<Words> colors = new ArrayList<>();

        colors.add(new Words("black", "itim", 1));
        colors.add(new Words("blue", "asul", 2));
        colors.add(new Words("brown", "tsokolate", 3));
        colors.add(new Words("green", "berde", 4));
        colors.add(new Words("orange", "kahel", 5));
        colors.add(new Words("pink", "rosas", 6));
        colors.add(new Words("red", "pula", 7));
        colors.add(new Words("violet", "lila", 8));
        colors.add(new Words("yellow", "dilaw", 9));
        colors.add(new Words("white", "puti", 10));

        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
