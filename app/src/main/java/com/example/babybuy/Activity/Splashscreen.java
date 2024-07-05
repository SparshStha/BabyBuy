package com.example.babybuy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.babybuy.R;

public class Splashscreen extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
    
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                checkUserLogin();
            }
        }, 3000);
    }
    
    private void checkUserLogin() {
        SharedPreferences sharedPreferences = getSharedPreferences(
                "login_pref",
                MODE_PRIVATE
        );
        boolean defaultValue = false;
        boolean isLoggedAlready = sharedPreferences
                .getBoolean("is_logged_in", defaultValue);
        
        Intent intent;
        if (isLoggedAlready) {
            intent = new Intent(
                    Splashscreen.this,
                    MainActivity.class
            );
        } else {
            intent = new Intent(
                    Splashscreen.this,
                    LoginActivity.class
            );
        }
        startActivity(intent);
        finish();
    
    }
}