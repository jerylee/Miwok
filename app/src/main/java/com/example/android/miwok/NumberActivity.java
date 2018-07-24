package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {
    private static final String TAG = "Number Activity";
    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;
    /**
     * This listener gets triggered whenever the audio focus changes
     * (i.e., we gain or lose audio focus because of another app or device).
     */
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
                // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
                // our app is allowed to continue playing sound but at a lower volume. We'll treat
                // both cases the same way because our app is playing short sound files.

                // Pause playback and reset player to the start of the file. That way, we can
                // play the word from the beginning when we resume playback.
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0); // 0 --> hear from beginning of the audio file
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
                //
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                // The AUDIOFOCUS_LOSS case means we've lost audio focus and
                // Stop playback and clean up resources
                releaseMediaPlayer();
            }
        }
    };

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        //        String[] ArrayWord = new String[10];
        //        ArrayWord[0]="one";
        //        ArrayWord[1]="two";
        //        ArrayWord[2]="three";
        //        ArrayWord[3]="four";
        //        ArrayWord[4]="five";
        //        ArrayWord[5]="six";
        //        ArrayWord[6]="seven";
        //        ArrayWord[7]="eight";
        //        ArrayWord[8]="nine";
        //        ArrayWord[9]="ten";
        //
        //        Log.v("LOG:","ArrayWord index 5 : "+ArrayWord[5]);

        //add "final" for make the Array can know the position
        final ArrayList<Word> words = new ArrayList<>();
        //add two object to our word class
        words.add(new Word("luti", "one", R.raw.number_one, R.drawable.number_one));
        words.add(new Word("otiiko", "two", R.raw.number_two, R.drawable.number_two));
        words.add(new Word("tolookosu", "three", R.raw.number_three, R.drawable.number_three));
        words.add(new Word("oyyisa", "four", R.raw.number_four, R.drawable.number_four));
        words.add(new Word("massokka", "five", R.raw.number_five, R.drawable.number_five));
        words.add(new Word("temmokka", "six", R.raw.number_six, R.drawable.number_six));
        words.add(new Word("kenekaku", "seven", R.raw.number_seven, R.drawable.number_seven));
        words.add(new Word("kawinta", "eight", R.raw.number_eight, R.drawable.number_eight));
        words.add(new Word("wo’e", "nine", R.raw.number_nine, R.drawable.number_nine));
        words.add(new Word("na’aacha", "ten", R.raw.number_ten, R.drawable.number_ten));

        //        number.add("one");
        //        number.add("two");
        //        number.add("tree");
        //        number.add("four");
        //        number.add("five");
        //        number.add("six");
        //        number.add("seven");
        //        number.add("eight");
        //        number.add("nine");
        //        number.add("ten");
        //        number.add("");
        //        Log.v("Log ", "index value 0:" + number.get(0) + ", 1:" + number.get(1) + ", 2:" + number.get(2) + ", 3:" + number.get(3) + ", 4:" + number.get(4) + ", 5:" + number.get(5) + ", 6:" + number.get(6) + ", 7:" + number.get(7) + ", 8:" + number.get(8) + ", 9:" + number.get(9));
        //        Log.v("Log ", "index Size is : " + number.size());

        //        LinearLayout rootView = findViewById(R.id.rootView);
        ////        TextView numberView = new TextView(this);
        ////        numberView.setText(number.get(0));
        ////        rootView.addView(numberView);
        //
        //
        //        //this is using While Loop
        //        int i = 0; //declaration variable for doing looping.
        //        while (i < number.size()) { //the condition/how many time the looping will happen.
        //            TextView numberView = new TextView(this);
        //            numberView.setText(number.get(i));
        //            rootView.addView(numberView);
        //            i++; // --> it's same like "i = i + 1;"
        //        }
        //
        //        //this is using For Loop
        //        for (int x=0; x<number.size(); x++){ // ( declaration variable for doing looping; condition/how many time the lopping; variable changing )
        //            TextView numberView = new TextView(this);
        //            numberView.setText(number.get(x));
        //            rootView.addView(numberView);
        //        }
        //
        //

        //       ArrayAdapter<Word> itemAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);
        WordAdapter itemAdapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = findViewById(R.id.word_list);
        listView.setAdapter(itemAdapter);


        //Set listView i=position to get correct sound/music file for playing
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Word word = words.get(i);

                // Request audio focus for playback
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        // Use the music stream.
                        AudioManager.STREAM_MUSIC,
                        // Request permanent focus.
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {

                    // below is the Audio Focus
                    releaseMediaPlayer();
//                  Toast.makeText(NumberActivity.this, "got click", Toast.LENGTH_SHORT).show();
                    mMediaPlayer = MediaPlayer.create(NumberActivity.this, word.getAudioResourceId());
                    mMediaPlayer.start();

                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                    //create Log for checking
                    Log.v(TAG, "Current Word: " + word.toString());

                }
            }
        });

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
//                mMediaPlayer.start();
//            }
//        });


        //        //chnage ListView to GridView
        //        Spinner gridView = findViewById(R.id.rootView);
        //        gridView.setAdapter(itemAdapter);


    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;

            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }


}