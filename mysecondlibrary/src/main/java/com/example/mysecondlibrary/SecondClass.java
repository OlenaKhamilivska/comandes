package com.example.mysecondlibrary;

import android.content.Context;
import android.widget.Toast;

public class SecondClass {

    public static void showToast (Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
