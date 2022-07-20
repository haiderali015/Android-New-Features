package com.example.coundowntimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"This is toast",Toast.LENGTH_SHORT);
                handler.postDelayed(this,1000);
            }
        }

    }
}