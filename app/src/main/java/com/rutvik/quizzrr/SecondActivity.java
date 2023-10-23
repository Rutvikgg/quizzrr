package com.rutvik.quizzrr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class SecondActivity extends Activity {
    TextView usernameTextView;
//    SharedPreferences sharedPreferences = getSharedPreferences("com.rutvik.quizzrr.SharedPreferences", Context.MODE_PRIVATE);
//    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button takequiz_button = findViewById(R.id.takequiz_button);
        usernameTextView = findViewById(R.id.usernameTextView);
//        String username = sharedPreferences.getString("username", null);
//        usernameTextView.setText(username);

        takequiz_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

    }
}