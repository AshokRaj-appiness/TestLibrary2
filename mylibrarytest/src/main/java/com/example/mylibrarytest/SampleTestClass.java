package com.example.mylibrarytest;

import android.content.Context;
import android.widget.Toast;

public class SampleTestClass {
    public static void printMessage(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
