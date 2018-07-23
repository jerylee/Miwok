package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class AndroidLifeCycle extends AppCompatActivity {

    final static String LOG = "LOG : Android life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_life_cycle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(LOG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(LOG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(LOG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(LOG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(LOG, "onDestroy");
    }
}
