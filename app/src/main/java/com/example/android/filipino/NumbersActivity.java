package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> num = new ArrayList<String>();
        num.add("one");
        num.add("two");
        num.add("three");
        num.add("four");
        num.add("five");
        num.add("six");
        num.add("seven");
        num.add("eight");
        num.add("nine");
        num.add("ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, num);
        ListView listView = findViewById(R.id.list_numbers);
        listView.setAdapter(itemsAdapter);
    }
}
