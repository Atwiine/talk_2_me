package com.talktome.talk;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Calendar;

public class Settings extends AppCompatActivity {
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.this, SpeakToMe.class));
                finish();
            }
        });
        dialog = new Dialog(Settings.this);
    }

    public void openinput(View view) {

        startActivity(new Intent(Settings.this, AudioInput.class));
    }

    public void openLanguage(View view) {
        dialog.setContentView(R.layout.language);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

    ImageView close = dialog.findViewById(R.id.close);
    close.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialog.dismiss();
        }
    });

        dialog.show();
    }


    public void openhelp(View view) {

        startActivity(new Intent(Settings.this, Help.class));
    }

    public void openabout(View view) {
        startActivity(new Intent(Settings.this, About.class));
    }
}