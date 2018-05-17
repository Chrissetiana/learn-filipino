package com.example.android.filipino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<String> fam = new ArrayList<String> ();
        fam.add("Father");
        fam.add("Mother");
        fam.add("Sister");
        fam.add("Brother");
        fam.add("Uncle");
        fam.add("Aunt");
        fam.add("Grandfather");
        fam.add("Grandmother");
        fam.add("Cousin");
        fam.add("Baby");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fam);
        GridView gridView = findViewById(R.id.list_family);
        gridView.setAdapter(itemsAdapter);
    }
}
