package com.example.android.filipino;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("black", "itim", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("blue", "asul", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("brown", "tsokolate", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("green", "berde", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("orange", "kahel", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("pink", "rosas", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("red", "pula", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("violet", "lila", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("yellow", "dilaw", R.mipmap.ic_launcher, R.raw.bongo));
        words.add(new Word("white", "puti", R.mipmap.ic_launcher, R.raw.bongo));
        // words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.bongo));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currWord = words.get(position);
                Log.v("ColorsActivity", "Current word: " + currWord);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, currWord.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
