package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

//    private MediaPlayer mMediaPlayer;
//    private AudioManager mAudioManager;
//    /**
//     * This listener gets triggered whenever the audio focus changes
//     * (i.e., we gain or lose audio focus because of another app or device).
//     */
//    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
//        @Override
//        public void onAudioFocusChange(int focusChange) {
//            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
//                // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
//                // our app is allowed to continue playing sound but at a lower volume. We'll treat
//                // both cases the same way because our app is playing short sound files.
//
//                // Pause playback and reset player to the start of the file. That way, we can
//                // play the word from the beginning when we resume playback.
//                mMediaPlayer.pause();
//                mMediaPlayer.seekTo(0); // 0 --> hear from beginning of the audio file
//            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
//                // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
//                //
//                mMediaPlayer.start();
//            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
//                // The AUDIOFOCUS_LOSS case means we've lost audio focus and
//                // Stop playback and clean up resources
//                releaseMediaPlayer();
//            }
//        }
//    };
//
//    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//            releaseMediaPlayer();
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list); //not use fragment

        //use Fragment
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new ColorsFragment()).commit();


//        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
//        //add "final" for make the Array can know the position
//        final ArrayList<Word> words = new ArrayList<>();
//        words.add(new Word("weṭeṭṭi", "red", R.raw.color_red, R.drawable.color_red));
//        words.add(new Word("chiwiiṭә", "mustard yellow", R.raw.color_mustard_yellow, R.drawable.color_mustard_yellow));
//        words.add(new Word("ṭopiisә", "dusty yellow", R.raw.color_dusty_yellow, R.drawable.color_dusty_yellow));
//        words.add(new Word("chokokki", "green", R.raw.color_green, R.drawable.color_green));
//        words.add(new Word("ṭakaakki", "brown", R.raw.color_brown, R.drawable.color_brown));
//        words.add(new Word("ṭopoppi", "gray", R.raw.color_gray, R.drawable.color_gray));
//        words.add(new Word("kululli", "black", R.raw.color_black, R.drawable.color_black));
//        words.add(new Word("kelelli", "white", R.raw.color_white, R.drawable.color_white));
//
//        WordAdapter itemAdapter = new WordAdapter(this, words, R.color.category_colors);
//        ListView listView = findViewById(R.id.word_list);
//        listView.setAdapter(itemAdapter);
//
//
//        //Set listView i=position to get correct sound/music file for playing
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Word word = words.get(i);
//
//                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
//                        // Use the music stream.
//                        AudioManager.STREAM_MUSIC,
//                        // Request permanent focus.
//                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//
//                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//
//                    // below is the Audio Focus
//                    releaseMediaPlayer();
//                    mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());
//                    mMediaPlayer.start();
//                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
//                }
//            }
//        });
    }

//    @Override
//    public void onStop() {
//        super.onStop();
//        releaseMediaPlayer();
//    }
//
//    private void releaseMediaPlayer() {
//        if (mMediaPlayer != null) {
//            mMediaPlayer.release();
//            mMediaPlayer = null;
//
//            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
//        }
//    }
}
