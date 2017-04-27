package com.example.user.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreFed = 0;
    int scoreDim = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addAceForFed (View v){
        scoreFed = scoreFed + 1;
        displayForFed(scoreFed);
    }

    public void addForehandForFed (View v) {
        scoreFed = scoreFed + 1;
        displayForFed(scoreFed);
    }

    public void addBackhandForFed (View v) {
        scoreFed = scoreFed + 1;
        displayForFed(scoreFed);
    }

    public void addAceForDim (View v){
        scoreDim = scoreDim + 1;
        displayForDim(scoreDim);
    }

    public void addForehandForDim (View v) {
        scoreDim = scoreDim + 1;
        displayForDim(scoreDim);
    }

    public void addBackhandForDim (View v) {
        scoreDim = scoreDim + 1;
        displayForDim(scoreDim);
    }

    /**
     * Resets the score for both players.
     */
    public void resetScore (View v){
        scoreFed = 0;
        scoreDim = 0;
        displayForFed(scoreFed);
        displayForDim(scoreDim);
    }
    /**
     * Displays the given score for Federer.
     */
    public void displayForFed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fed_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Dimitrov.
     */
    public void displayForDim(int score) {
        TextView scoreView = (TextView) findViewById(R.id.dim_score);
        scoreView.setText(String.valueOf(score));
    }
}

