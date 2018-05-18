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

        months.add(new Word("january", "enero", 1));
        months.add(new Word("february", "pebrero", 1));
        months.add(new Word("march", "marso", 1));
        months.add(new Word("april", "abril", 1));
        months.add(new Word("may", "mayo", 1));
        months.add(new Word("june", "hunyo", 1));
        months.add(new Word("july", "hulyo", 1));
        months.add(new Word("august", "agosto", 1));
        months.add(new Word("september", "setyembre", 1));
        months.add(new Word("october", "oktubre", 1));
        months.add(new Word("november", "nobyembre", 1));
        months.add(new Word("december", "disyembre", 1));

        WordAdapter adapter = new WordAdapter(this, months);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
