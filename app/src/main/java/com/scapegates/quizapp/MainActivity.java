package com.scapegates.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    int score;
    final int QUESTIONS = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
    }

    public void submit(View view) {
        RadioButton radio = (RadioButton) findViewById(R.id.right_answer_radio);
        CheckBox check1 = (CheckBox) findViewById(R.id.right_answer_check1);
        CheckBox check2 = (CheckBox) findViewById(R.id.right_answer_check2);
        EditText firstText = (EditText) findViewById(R.id.text_answer_first);
        EditText secondText = (EditText) findViewById(R.id.text_answer_second);

        if(radio.isChecked()) {
            score++;
        }

        if(check1.isChecked() && check2.isChecked()) {
            score++;
        }

        if(firstText != null && firstText.getText().toString().equalsIgnoreCase(getString(R.string.text_answer_first))) {
            score++;
        }

        if(secondText!= null && secondText.getText().toString().equalsIgnoreCase(getString(R.string.text_answer_second))) {
            score++;
        }

        Intent showAnswer = new Intent(this, ResultsActivity.class);
        showAnswer.putExtra(getString(R.string.questions), QUESTIONS);
        showAnswer.putExtra(getString(R.string.score), score);
        startActivity(showAnswer);
        score = 0;
    }
}
