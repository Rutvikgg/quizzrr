package com.rutvik.quizzrr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentCallbacks2;
import android.content.Intent;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SeventhActivity extends Activity implements View.OnClickListener {

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;
    TextView countdownTextView;

    int score = 0;
    int totalQuestion = QuestionAnswer1.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    private CountDownTimer quizTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total questions : " + totalQuestion);

        loadNewQuestion();

        countdownTextView = findViewById(R.id.countdownTextView);
        startCountdownTimer(180000);


    }

    void startCountdownTimer(long millisInFuture) {
        quizTimer = new CountDownTimer(millisInFuture, 1000) {
            public void onTick(long millisUntilFinished) {
                long secondsRemaining = millisUntilFinished / 1000;
                countdownTextView.setText("Time remaining: " + secondsRemaining + " seconds");
            }

            public void onFinish() {
                countdownTextView.setText("Time's up!");
                submitQuiz();
            }
        }.start();
    }

    void submitQuiz() {
        finishQuiz();
    }

    @Override
    public void onClick(View view) {

        ColorStateList colorStateList = ColorStateList.valueOf(Color.parseColor("#FFFFFF"));
        ansA.setBackgroundTintList(colorStateList);
        ansB.setBackgroundTintList(colorStateList);
        ansC.setBackgroundTintList(colorStateList);
        ansD.setBackgroundTintList(colorStateList);

        Button clickedButton = (Button) view;
        if (clickedButton.getId() == R.id.submit_btn) {
            if (selectedAnswer.equals(QuestionAnswer1.correctAnswers[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        } else {
            selectedAnswer = clickedButton.getText().toString();
            ColorStateList checkedcolorStateList = ColorStateList.valueOf(Color.parseColor("#1ddb30"));
            clickedButton.setBackgroundTintList(checkedcolorStateList);

        }

    }

    void loadNewQuestion() {

        if (currentQuestionIndex == totalQuestion) {
            finishQuiz();
            return;
        }

        questionTextView.setText(QuestionAnswer1.question[currentQuestionIndex]);
        ansA.setText(QuestionAnswer1.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer1.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer1.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer1.choices[currentQuestionIndex][3]);

    }

    void finishQuiz() {
        String passStatus = "";
        if (score > totalQuestion * 0.60) {
            passStatus = "Passed";
        } else {
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is " + score + " out of " + totalQuestion)
                .setPositiveButton("Home", (dialogInterface, i) -> home())
                .setCancelable(false)
                .show();


    }

    void home() {
        Intent intent = new Intent(SeventhActivity.this, MainActivity.class);
        startActivity(intent);
//        score = 0;
//        currentQuestionIndex = 0;
//        loadNewQuestion();
    }
}
