package com.example.android.filipino;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("good morning", "magandang umaga", R.raw.bass));
        words.add(new Word("good afternoon", "magandang tanghali / hapon", R.raw.bass));
        words.add(new Word("good evening", "magandang gabi", R.raw.bass));
        words.add(new Word("good day", "magandang araw", R.raw.bass));
        words.add(new Word("how are you", "kamusta [ka]", R.raw.bass));
        words.add(new Word("good bye", "paalam", R.raw.bass));
        words.add(new Word("sorry", "patawad", R.raw.bass));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currWord = words.get(position);
                Log.v("PhrasesActivity", "Current word: " + currWord);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, currWord.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
