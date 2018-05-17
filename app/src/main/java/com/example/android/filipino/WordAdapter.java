package com.example.android.filipino;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Words> {

    public WordAdapter(Activity context, ArrayList<Words> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_layout, parent, false);
        }

        Words currWord = getItem(position);

        TextView engTextView = listItemView.findViewById(R.id.text_english);
        engTextView.setText(currWord.getEnglishTranslation());

        TextView filTextView = listItemView.findViewById(R.id.text_filipino);
        filTextView.setText(currWord.getFilipinoTranslation());

        ImageView iconView = listItemView.findViewById(R.id.text_icon);
        iconView.setImageResource(currWord.getImageResourceId());

        return listItemView;
    }
}
