package com.talktome.talk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void openMain(View view) {
    }

    public void openLogin(View view) {
        startActivity(new Intent(Register.this, Login.class));
    }

    public void backoptions(View view) {
        startActivity(new Intent(Register.this, MainActivity.class));
    }
}