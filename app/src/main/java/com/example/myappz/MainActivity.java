package com.example.myappz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText; //declaration

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.UName); //initialization
    }


    public void showToastMessage(View view) {
        //Toast.makeText(this, "welcome to android", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, R.string.message, Toast.LENGTH_LONG).show();
        String name = nameEditText.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        i.putExtra("waterkey",name);
        startActivity(i);

        add(10, 20);
    }

    int add(int fnum, int snum) {
        return fnum + snum;
    }

    public void nextActivity(View v) {
        // TODO Auto-generated method stub


    }
}