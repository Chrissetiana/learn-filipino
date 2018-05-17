package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
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

        LinearLayout rootView = findViewById(R.id.view_numbers);

        for(int i=0; i<num.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(num.get(i));
            rootView.addView(wordView);
        }
    }
}
