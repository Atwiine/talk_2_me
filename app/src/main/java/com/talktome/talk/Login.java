package com.talktome.talk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openMain(View view) {
        startActivity(new Intent(Login.this, SpeakToMe.class));
    }
    public void backoptions(View view) {
        startActivity(new Intent(Login.this, MainActivity.class));
    }
}