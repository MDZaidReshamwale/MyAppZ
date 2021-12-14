package com.example.myappz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView homeTextView = findViewById(R.id.display);
        String name = getIntent().getExtras().getString("waterkey");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        homeTextView.setText(name);
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