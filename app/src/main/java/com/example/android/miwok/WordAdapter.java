package com.example.android.miwok;

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

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWordAdapter = getItem(position);

        ImageView iconView = listItemView.findViewById(R.id.icon);
        iconView.setImageResource(currentWordAdapter.getImageResourceId());

        TextView textView = listItemView.findViewById(R.id.miwok_text_view);
        textView.setText(currentWordAdapter.getmMiwokTranslation());

        TextView textView2 = listItemView.findViewById(R.id.default_text_view);
        textView2.setText(currentWordAdapter.getmDefaultTranslation());


        return listItemView;
    }
}
