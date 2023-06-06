package com.example.mysecondlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mysecondlibrary.SecondClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SecondClass.showToast(this, "Hi, people!");
    }
}