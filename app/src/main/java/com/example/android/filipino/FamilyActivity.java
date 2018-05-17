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
        fam.add("father");
        fam.add("mother");
        fam.add("sister");
        fam.add("brother");
        fam.add("uncle");
        fam.add("aunt");
        fam.add("grandfather");
        fam.add("grandmother");
        fam.add("cousin");
        fam.add("baby");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fam);
        ListView listView = findViewById(R.id.list_family);
        listView.setAdapter(itemsAdapter);
    }
}
