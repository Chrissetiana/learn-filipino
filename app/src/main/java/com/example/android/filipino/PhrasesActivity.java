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

        phrases.add(new Word("good morning", "magandang umaga", R.mipmap.ic_launcher));
        phrases.add(new Word("good afternoon", "magandang tanghali / hapon", R.mipmap.ic_launcher));
        phrases.add(new Word("good evening", "magandang gabi", R.mipmap.ic_launcher));
        phrases.add(new Word("good day", "magandang araw", R.mipmap.ic_launcher));
        phrases.add(new Word("how are you", "kamusta [ka]", R.mipmap.ic_launcher));
        phrases.add(new Word("good bye", "paalam", R.mipmap.ic_launcher));

        WordAdapter adapter = new WordAdapter(this, phrases);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
