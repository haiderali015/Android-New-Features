package com.example.coundowntimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public class BG extends AsyncTask<String,Void,String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d("HaiderBackground","onPreExecute:run");
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d("HaiderBackground","onPreExecute:run");
        }

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }
    }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }

    public void getview(View view)
    {
        Toast.makeText(this,"HI IaM TOAST",Toast.LENGTH_SHORT).show();

    }
}