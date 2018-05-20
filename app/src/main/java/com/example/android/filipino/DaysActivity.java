package com.example.android.filipino;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DaysActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("monday", "lunes", R.mipmap.ic_launcher, R.raw.highhat));
        words.add(new Word("tuesday", "martes", R.mipmap.ic_launcher, R.raw.highhat));
        words.add(new Word("wednesday", "miyerkules", R.mipmap.ic_launcher, R.raw.highhat));
        words.add(new Word("thursday", "huwebes", R.mipmap.ic_launcher, R.raw.highhat));
        words.add(new Word("friday", "biyernes", R.mipmap.ic_launcher, R.raw.highhat));
        words.add(new Word("saturday", "sabado", R.mipmap.ic_launcher, R.raw.highhat));
        words.add(new Word("sunday", "linggo", R.mipmap.ic_launcher, R.raw.highhat));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currWord = words.get(position);
                Log.v("DaysActivity", "Current word: " + currWord);
                mediaPlayer = MediaPlayer.create(DaysActivity.this, currWord.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}