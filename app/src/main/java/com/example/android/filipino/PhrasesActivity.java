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

        ArrayList<Word> phrases = new ArrayList<>();

        phrases.add(new Word("good morning", "magandang umaga"));
        phrases.add(new Word("good afternoon", "magandang tanghali / hapon"));
        phrases.add(new Word("good evening", "magandang gabi"));
        phrases.add(new Word("good day", "magandang araw"));
        phrases.add(new Word("how are you", "kamusta [ka]"));
        phrases.add(new Word("good bye", "paalam"));

        WordAdapter adapter = new WordAdapter(this, phrases);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
