package com.scapegates.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int score, numQuestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        Intent showAnswer = new Intent(this, ResultsActivity.class);
        showAnswer.putExtra("QUESTIONS", numQuestions);
        showAnswer.putExtra("SCORE", score);
        startActivity(showAnswer);
    }
}
