package com.svartingknas.top10downloader;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Starting Asynctask");
        DownloadData downloadData =  new DownloadData();
        downloadData.execute("Url goes here");
        Log.d(TAG, "onCreate: Done");

    }

    private class DownloadData extends AsyncTask<String, Void, String>{
        private static final String TAG = "DownloadData";

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d(TAG, "onPostExecute: Parameter is " + s);
        }

        @Override
        protected String doInBackground(String... strings) {
            Log.d(TAG, "doInBackground: Starts with " + strings[0]);
            return "Do in background completed";
        }
    }

}
