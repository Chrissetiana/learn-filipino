package com.example.android.filipino;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PeopleActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("father", "tatay / ama", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("mother", "nanay / ina", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("child", "anak", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("sibling", "kapatid", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("big brother", "kuya", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("big sister", "ate", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("grandfather", "lolo", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("grandmother", "lola", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("uncle", "tito", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("aunt", "tita", R.mipmap.ic_launcher, R.raw.bass));
        words.add(new Word("cousin", "pinsan", R.mipmap.ic_launcher, R.raw.bass));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currWord = words.get(position);
                Log.v("PeopleActivity", "Current word: " + currWord);
                mediaPlayer = MediaPlayer.create(PeopleActivity.this, currWord.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
