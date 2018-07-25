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

public class FamilyActivity extends AppCompatActivity {

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
//        setContentView(R.layout.word_list); //before using Fragment

        //use Fragment
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new FamilyFragment()).commit();

//        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
//        //add "final" for make the Array can know the position
//        final ArrayList<Word> words = new ArrayList<>();
//        words.add(new Word("әpә", "father", R.raw.family_father, R.drawable.family_father));
//        words.add(new Word("әṭa", "mother", R.raw.family_mother, R.drawable.family_mother));
//        words.add(new Word("angsi", "son", R.raw.family_son, R.drawable.family_son));
//        words.add(new Word("tune", "daughter", R.raw.family_daughter, R.drawable.family_daughter));
//        words.add(new Word("taachi", "older brother", R.raw.family_older_brother, R.drawable.family_older_brother));
//        words.add(new Word("chalitti", "younger brother", R.raw.family_younger_brother, R.drawable.family_younger_brother));
//        words.add(new Word("teṭe", "older sister", R.raw.family_older_sister, R.drawable.family_older_sister));
//        words.add(new Word("kolliti", "younger sister", R.raw.family_younger_sister, R.drawable.family_younger_sister));
//        words.add(new Word("ama", "grandmother", R.raw.family_grandmother, R.drawable.family_grandmother));
//        words.add(new Word("paapa", "grandfather", R.raw.family_grandfather, R.drawable.family_grandfather));
//
//        WordAdapter itemAdapter = new WordAdapter(this, words, R.color.category_family);
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
//                    mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
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
