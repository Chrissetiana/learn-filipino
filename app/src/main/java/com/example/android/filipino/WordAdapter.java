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

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    @NonNull
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_layout, parent, false);
        }

        Word currWord = getItem(position);

        TextView engTextView = listItemView.findViewById(R.id.text_english);
        engTextView.setText(currWord.getEnglishTranslation());

        TextView filTextView = listItemView.findViewById(R.id.text_filipino);
        filTextView.setText(currWord.getFilipinoTranslation());

        ImageView imageView = listItemView.findViewById(R.id.text_icon);
        if (currWord.hasImage()) {
            imageView.setImageResource(currWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
