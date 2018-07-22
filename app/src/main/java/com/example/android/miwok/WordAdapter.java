package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int mColorResourceId; //for set differed color each activity

    private MediaPlayer mediaPlayer;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId; //for set differed color each activity

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWordAdapter = getItem(position);

        TextView textView = listItemView.findViewById(R.id.miwok_text_view);
        textView.setText(currentWordAdapter.getmMiwokTranslation());

        TextView textView2 = listItemView.findViewById(R.id.default_text_view);
        textView2.setText(currentWordAdapter.getmDefaultTranslation());


        ImageView imageView = listItemView.findViewById(R.id.image);
        //Set if have Image resource
        if (currentWordAdapter.hasImage()) {
            imageView.setImageResource(currentWordAdapter.getImageResourceId());
            //if HAVE image we must set the Visibility is VISIBLE
            imageView.setVisibility(View.VISIBLE);
        } else {
            //if no any Image resource set it become GONE/No display the image
            imageView.setVisibility(View.GONE);
        }


        //for set differed color each activity
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
