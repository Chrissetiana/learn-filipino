package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Words> phrases = new ArrayList<>();

        phrases.add(new Words("good morning", "magandang umaga", 1));
        phrases.add(new Words("good afternoon", "magandang tanghali / hapon", 2));
        phrases.add(new Words("good evening", "magandang gabi", 3));
        phrases.add(new Words("good day", "magandang araw", 4));
        phrases.add(new Words("how are you", "kamusta [ka]", 5));
        phrases.add(new Words("good bye", "paalam", 6));

        WordAdapter adapter = new WordAdapter(this, phrases);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
