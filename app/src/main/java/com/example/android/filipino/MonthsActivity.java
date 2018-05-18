package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MonthsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> months = new ArrayList<>();

        months.add(new Word("january", "enero", R.mipmap.ic_launcher));
        months.add(new Word("february", "pebrero", R.mipmap.ic_launcher));
        months.add(new Word("march", "marso", R.mipmap.ic_launcher));
        months.add(new Word("april", "abril", R.mipmap.ic_launcher));
        months.add(new Word("may", "mayo", R.mipmap.ic_launcher));
        months.add(new Word("june", "hunyo", R.mipmap.ic_launcher));
        months.add(new Word("july", "hulyo", R.mipmap.ic_launcher));
        months.add(new Word("august", "agosto", R.mipmap.ic_launcher));
        months.add(new Word("september", "setyembre", R.mipmap.ic_launcher));
        months.add(new Word("october", "oktubre", R.mipmap.ic_launcher));
        months.add(new Word("november", "nobyembre", R.mipmap.ic_launcher));
        months.add(new Word("december", "disyembre", R.mipmap.ic_launcher));

        WordAdapter adapter = new WordAdapter(this, months);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
