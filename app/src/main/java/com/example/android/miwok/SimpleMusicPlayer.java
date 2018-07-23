package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SimpleMusicPlayer extends AppCompatActivity {
    private Button b1, b2;
    private MediaPlayer mediaPlayer;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_music_player);


        b1 = findViewById(R.id.btn_play);
        b2 = findViewById(R.id.btn_pause);


        mediaPlayer = MediaPlayer.create(SimpleMusicPlayer.this, R.raw.number_one);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                             Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
//                releaseMediaPlayer();
//                mediaPlayer = MediaPlayer.create(SimpleMusicPlayer.this, R.raw.number_one);
                mediaPlayer.start();
//                mediaPlayer.setOnCompletionListener(mCompletionListener);


//                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mediaPlayer) {
//                        Toast.makeText(getApplicationContext(), "Finish", Toast.LENGTH_SHORT).show();
//                        mediaPlayer.release();
//                    }
//                });
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Pause sound", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}