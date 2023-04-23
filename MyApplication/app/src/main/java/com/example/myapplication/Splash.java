package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent next = new Intent(Splash.this, MainMenu.class);
                startActivity(next);
                Splash.this.finish();
            }
        }, 3000);
    }
}