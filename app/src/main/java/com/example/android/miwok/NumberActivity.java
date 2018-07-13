package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

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

        ArrayList<String> number = new ArrayList<>();
        number.add("one");
        number.add("two");
        number.add("tree");
        number.add("four");
        number.add("five");
        number.add("six");
        number.add("seven");
        number.add("eight");
        number.add("nine");
        number.add("ten");
        number.add("");
//        Log.v("Log ", "index value 0:" + number.get(0) + ", 1:" + number.get(1) + ", 2:" + number.get(2) + ", 3:" + number.get(3) + ", 4:" + number.get(4) + ", 5:" + number.get(5) + ", 6:" + number.get(6) + ", 7:" + number.get(7) + ", 8:" + number.get(8) + ", 9:" + number.get(9));
//        Log.v("Log ", "index Size is : " + number.size());

        LinearLayout rootView = findViewById(R.id.rootView);
//        TextView numberView = new TextView(this);
//        numberView.setText(number.get(0));
//        rootView.addView(numberView);


        //this is using While Loop
        int i = 0;
        while (i < number.size()) {
            TextView numberView = new TextView(this);
            numberView.setText(number.get(i));
            rootView.addView(numberView);
            i++; // --> it's same like "i = i + 1;"
        }

        //this is using For Loop
        for (int x=0; x<number.size(); x++){
            TextView numberView = new TextView(this);
            numberView.setText(number.get(x));
            rootView.addView(numberView);
        }

    }

}
