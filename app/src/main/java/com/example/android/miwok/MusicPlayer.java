package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.WindowDecorActionBar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MusicPlayer extends AppCompatActivity {

    public static int oneTimeOnly = 0;
    private Button b1, b2, b3, b4;
    private ImageView iv;
    private MediaPlayer mediaPlayer;
    private double startTime = 0;
    private double finalTime = 0;
    private Handler myHandler = new Handler();
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    private SeekBar seekbar;
    private TextView tx1, tx2, tx3;
    private Runnable UpdateSongTime = new Runnable() {
        @SuppressLint("DefaultLocale")
        public void run() {
            startTime = mediaPlayer.getCurrentPosition();
            tx1.setText(String.format("%02d:%02d",
                    TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime))));

            seekbar.setProgress((int) startTime);
            myHandler.postDelayed(this, 100);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);

        b1 = findViewById(R.id.btn_play_music);
        b2 = findViewById(R.id.btn_pause_music);
        b3 = findViewById(R.id.btn_backward);
        b4 = findViewById(R.id.btn_forward);
        iv = findViewById(R.id.image_music);

        tx1 = findViewById(R.id.tx_time_start);
        tx2 = findViewById(R.id.tx_time_end);
        tx3 = findViewById(R.id.tx_title);
        tx3.setText("Hello my music");

        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        seekbar = findViewById(R.id.seekbar);

        seekbar.setClickable(true);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);

        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Playing", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();

                b1.setEnabled(false);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);

                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();

                if (oneTimeOnly == 0) {
                    seekbar.setMax((int) finalTime);
                    oneTimeOnly = 1;
                }

                tx1.setText(String.format("%02d:%02d",
                        TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) startTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) startTime)))
                );

                tx2.setText(String.format("%02d:%02d",
                        TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                        TimeUnit.MILLISECONDS.toSeconds((long) finalTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime)))
                );


                seekbar.setProgress((int) startTime);
                myHandler.postDelayed(UpdateSongTime, 100);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Pause", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();

                b1.setEnabled(true);
                b2.setEnabled(false);
                b3.setEnabled(true);
                b4.setEnabled(true);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp = (int) startTime;

                if ((temp + forwardTime) <= finalTime) {
                    startTime = startTime + forwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(), "You have Jumped forward 5 seconds", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Can't jump forward 5 seconds", Toast.LENGTH_SHORT).show();
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp = (int) startTime;

                if ((temp + backwardTime) <= finalTime) {
                    startTime = startTime - backwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(), "You have Jumped backward 5 seconds", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Can't jump forward 5 seconds", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
