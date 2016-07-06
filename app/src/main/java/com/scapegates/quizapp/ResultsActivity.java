package com.scapegates.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    int score, questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        questions = getIntent().getIntExtra(getString(R.string.questions), 0);
        score = getIntent().getIntExtra(getString(R.string.score), 0);
        String scoreStr = "" + score + "/" + questions;
        ((TextView) findViewById(R.id.score)).setText(scoreStr);
    }
}
