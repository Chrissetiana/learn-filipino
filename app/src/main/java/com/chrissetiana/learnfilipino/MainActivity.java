package com.chrissetiana.learnfilipino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView animals = findViewById(R.id.animals);
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });

        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView days = findViewById(R.id.days);
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daysIntent = new Intent(MainActivity.this, DaysActivity.class);
                startActivity(daysIntent);
            }
        });


        TextView people = findViewById(R.id.people);
        people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, PeopleActivity.class);
                startActivity(familyIntent);
            }
        });


        TextView months = findViewById(R.id.months);
        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monthsIntent = new Intent(MainActivity.this, MonthsActivity.class);
                startActivity(monthsIntent);
            }
        });


        TextView numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }
}
