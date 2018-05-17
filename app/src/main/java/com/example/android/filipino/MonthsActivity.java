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

        ArrayList<Words> months = new ArrayList<>();

        months.add(new Words("january", "enero", 1));
        months.add(new Words("february", "pebrero", 1));
        months.add(new Words("march", "marso", 1));
        months.add(new Words("april", "abril", 1));
        months.add(new Words("may", "mayo", 1));
        months.add(new Words("june", "hunyo", 1));
        months.add(new Words("july", "hulyo", 1));
        months.add(new Words("august", "agosto", 1));
        months.add(new Words("september", "setyembre", 1));
        months.add(new Words("october", "oktubre", 1));
        months.add(new Words("november", "nobyembre", 1));
        months.add(new Words("december", "disyembre", 1));

        WordAdapter adapter = new WordAdapter(this, months);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
