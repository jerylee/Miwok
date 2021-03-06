package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //declaration of find the text id
        TextView numbers = findViewById(R.id.numbers);
        TextView family = findViewById(R.id.family);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);
        TextView simpleMusic = findViewById(R.id.simple_music_player);
        TextView music = findViewById(R.id.music_player);
        TextView androidLifeCycle = findViewById(R.id.life_cycle);
        TextView viewPager = findViewById(R.id.view_pager);


        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(numberIntent);
            }
        });


        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });


        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });


        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        simpleMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(MainActivity.this, SimpleMusicPlayer.class);
                startActivity(musicIntent);
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(MainActivity.this, MusicPlayer.class);
                startActivity(musicIntent);
            }
        });

        androidLifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(MainActivity.this, AndroidLifeCycle.class);
                startActivity(x);
            }
        });

        viewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(MainActivity.this, MyViewPager.class);
                startActivity(x);
            }
        });

    }

    /*
     * below code is for set onCLick event at XML side
     * then use this below code, for call another Explicit Intent
     */

//    public void openNumbersList(View view) {
//        Intent intent = new Intent(this, NumberActivity.class);
//        startActivity(intent);
//    }
//
//    public void openColorsList(View view) {
//        Intent intent = new Intent(this, ColorsActivity.class);
//        startActivity(intent);
//    }
//
//    public void openFamilyList(View view) {
//        Intent intent = new Intent(this, FamilyActivity.class);
//        startActivity(intent);
//    }
//
//    public void openPhrasesList(View view) {
//        Intent intent = new Intent(this, PhrasesActivity.class);
//        startActivity(intent);
//    }

}
