package com.zackeryrobinson.week4codingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ascendingSort();

    }

    //    1. . Say you have a string of characters.
//    Write an algorithm to collect and return a list of all substrings such that order is maintained
//    but characters may be skipped. So “frog” can produce fog, fg, rg, etc.
    public List<String> substringParser() {
        List<String> subStrings = new ArrayList<>();

        // How we collect EVERY substring
        String string = "frog";
        // Must return f, fr, fro, fo, fog, fg, r, ro, rog, o, og, g,
        // if char is g, then there are no other chars to print
        String stringBackwards = "gorf";
        // Must return g, go, gr, gf, gor, grf, gorf = all g combinations
        // For g, there is 1 1-letter combination, 1 4-letter combination, 3 2 letter combination, and 2 3-letter combinations
        // g would have the most number of combinations
        // What are all o combinations? sans g
        // o, or, of, orf
        // What are all r combinations sans g and o
        // r, rf
        // What are all f combinations sans g and o and r
        // f
        // So in a 4 letter word there are 1 4-char substring, 4 1-char substrings, 3 3-char substrings, and 6 2-char substrings
        // 1 4-char substring
        // 4 1-char substrings
        // 3 3-char substrings
        // 6 2-char substrings
        // Hash table? Maybe. Use recursion? Maybe.

        for (int i = 0; i < string.length(); i++) {

        }

        Log.d(TAG, "onCreate: " + string);

        return subStrings;
    }

    //    2. Sort the array with multiple same values in the array in an ascending order.
//    Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
//    Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
//    -Also find the highest number in the array (do not use any collections method)
    public void ascendingSort() {
        int[] array = {2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};
        int mode = 0, numOfOccurences = 0, temp, mostOccurences = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            Log.d(TAG, "ascendingSort: " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i+1]) {
                numOfOccurences++;
                Log.d(TAG, "numOfOccurences " + numOfOccurences);
                if (numOfOccurences > mostOccurences) {
                    mostOccurences = numOfOccurences;
                    mode = array[i];
                }
                Log.d(TAG, "mode = " +mode);
            } else {
                numOfOccurences = 0;
            }
        }
    }
}

