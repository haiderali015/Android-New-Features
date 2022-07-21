package com.example.coundowntimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
            Log.d("HaiderBackground","doinBackground:run");
            String result = "";
            URL url;
            HttpURLConnection conn;
            try
            {
                url=new URL(urls[0]);
                conn = (HttpURLConnection) url.openConnection();
                InputStream in = conn.getInputStream();
                InputStreamReader reader = new InputStreamReader();
                int data = reader.read();
                while (data!=-1)
                {
                    char current = (char) data;
                    result += current;
                    data=reader.read();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return "something went wrong";

            }
            return result;

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