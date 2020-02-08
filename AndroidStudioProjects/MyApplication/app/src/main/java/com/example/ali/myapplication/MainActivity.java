package com.example.ali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String MYTAG = "MyMesage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MYTAG,"onCreate");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(MYTAG,"onStart");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(MYTAG,"onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
     Log.i(MYTAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MYTAG,"onResume");
    }
}

