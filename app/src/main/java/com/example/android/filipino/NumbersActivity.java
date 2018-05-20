package com.example.android.filipino;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("one", "isa", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("two", "dalawa", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("three", "tatlo", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("four", "apat", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("five", "lima", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("six", "anim", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("seven", "pito", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("eight", "walo", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("nine", "siyam", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("ten", "sampu", R.mipmap.ic_launcher, R.raw.bass));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currWord = words.get(position);
                Log.v("NumbersActivity", "Current word: " + currWord);
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, currWord.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
