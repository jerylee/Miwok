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

public class PhrasesActivity extends AppCompatActivity {

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
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PhrasesFragment()).commit();

//        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
//        //add "final" for make the Array can know the position
//        final ArrayList<Word> words = new ArrayList<>();
//        words.add(new Word("minto wuksus?", "Where are you going?", R.raw.phrase_where_are_you_going));
//        words.add(new Word("tinnә oyaase'nә?", "What is your name?", R.raw.phrase_what_is_your_name));
//        words.add(new Word("oyaaset...", "My name is...", R.raw.phrase_my_name_is));
//        words.add(new Word("michәksәs?", "How are you feeling?", R.raw.phrase_how_are_you_feeling));
//        words.add(new Word("kuchi achit", "I’m feeling good.", R.raw.phrase_im_feeling_good));
//        words.add(new Word("әәnәs'aa?", "Are you coming?", R.raw.phrase_are_you_coming));
//        words.add(new Word("hәә’ әәnәm", "Yes, I’m coming.", R.raw.phrase_yes_im_coming));
//        words.add(new Word("әәnәm", "I’m coming.", R.raw.phrase_im_coming));
//        words.add(new Word("yoowutis", "Let’s go.", R.raw.phrase_lets_go));
//        words.add(new Word("әnni'nem", "Come here.", R.raw.phrase_come_here));
//
//        WordAdapter itemAdapter = new WordAdapter(this, words, R.color.category_phrases);
//        ListView listView = findViewById(R.id.word_list);
//        listView.setAdapter(itemAdapter);
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
//                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
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
