package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {
    private final String THIS = "NumbersActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")) ;
    }
}
