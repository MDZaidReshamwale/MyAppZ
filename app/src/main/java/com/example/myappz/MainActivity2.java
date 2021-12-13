package com.example.myappz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public  void Design (View view){
        Intent i = new Intent(getApplicationContext(),Design.class);
        startActivity(i);
    }

    public void Wewe(View view) {
        Intent i = new Intent(getApplicationContext(),Design.class);
        startActivity(i);
    }
}