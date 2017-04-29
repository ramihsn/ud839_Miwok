package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")) ;
        LinearLayout numbersActivity = (LinearLayout) findViewById(R.id.numbers_activity);
        for(String number: words){
            TextView tmp = new TextView(this);
            tmp.setText(number);
            numbersActivity.addView(tmp);
        }
    }
}
