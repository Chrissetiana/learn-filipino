package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PeopleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> person = new ArrayList<>();

        person.add(new Word("father", "tatay / ama", R.mipmap.ic_launcher));
        person.add(new Word("mother", "nanay / ina", R.mipmap.ic_launcher));
        person.add(new Word("child", "anak", R.mipmap.ic_launcher));
        person.add(new Word("sibling", "kapatid", R.mipmap.ic_launcher));
        person.add(new Word("big brother", "kuya", R.mipmap.ic_launcher));
        person.add(new Word("big sister", "ate", R.mipmap.ic_launcher));
        person.add(new Word("grandfather", "lolo", R.mipmap.ic_launcher));
        person.add(new Word("grandmother", "lola", R.mipmap.ic_launcher));
        person.add(new Word("uncle", "tito", R.mipmap.ic_launcher));
        person.add(new Word("aunt", "tita", R.mipmap.ic_launcher));
        person.add(new Word("cousin", "pinsan", R.mipmap.ic_launcher));

        WordAdapter adapter = new WordAdapter(this, person);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
