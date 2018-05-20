package com.example.android.filipino;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MonthsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("january", "enero", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("february", "pebrero", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("march", "marso", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("april", "abril", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("may", "mayo", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("june", "hunyo", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("july", "hulyo", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("august", "agosto", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("september", "setyembre", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("october", "oktubre", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("november", "nobyembre", R.mipmap.ic_launcher, R.raw.snare));
        words.add(new Word("december", "disyembre", R.mipmap.ic_launcher, R.raw.snare));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currWord = words.get(position);
                Log.v("MonthsActivity", "Current word: " + currWord);
                mediaPlayer = MediaPlayer.create(MonthsActivity.this, currWord.getAudioResourceId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(completionListener);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
