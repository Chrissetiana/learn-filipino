package com.example.android.filipino;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("dog", "aso", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("cat", "pusa", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("fish", "isda", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("bird", "ibon", R.mipmap.ic_launcher, R.raw.bass));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currWord = words.get(position);
                mediaPlayer = MediaPlayer.create(AnimalsActivity.this, currWord.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
