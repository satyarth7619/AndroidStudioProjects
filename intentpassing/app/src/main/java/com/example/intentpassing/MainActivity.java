package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext;

        btnNext =findViewById(R.id.btnNext);

        Intent iNext;
        iNext = new Intent(MainActivity.this, SecondActivity.class);
        iNext.putExtra("tittle", "Home");
        iNext.putExtra("Student", "Satyarth");
        iNext.putExtra("Roll","10");


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {startActivity(iNext);}

        });
    }
}