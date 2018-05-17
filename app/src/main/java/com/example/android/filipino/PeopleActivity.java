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

        ArrayList<Words> person = new ArrayList<>();

        person.add(new Words("father", "tatay / ama", 1));
        person.add(new Words("mother", "nanay / ina", 2));
        person.add(new Words("child", "anak", 3));
        person.add(new Words("sibling", "kapatid", 4));
        person.add(new Words("big brother", "kuya", 5));
        person.add(new Words("big sister", "ate", 6));
        person.add(new Words("grandfather", "lolo", 7));
        person.add(new Words("grandmother", "lola", 8));
        person.add(new Words("uncle", "tito", 9));
        person.add(new Words("aunt", "tita", 10));
        person.add(new Words("cousin", "pinsan", 11));

        WordAdapter adapter = new WordAdapter(this, person);
        ListView listView = findViewById(R.id.list_words);
        listView.setAdapter(adapter);
    }
}
