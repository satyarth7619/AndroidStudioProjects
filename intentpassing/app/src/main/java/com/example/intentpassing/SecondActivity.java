package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.jar.Attributes;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromAct = getIntent();
        String tittle =fromAct.getStringExtra("tittle");
        String Student =fromAct.getStringExtra("Student");
        int Roll =  fromAct.getIntExtra("Roll",0);

        TextView txtStudentInfo;

        txtStudentInfo = findViewById(R.id.txtStudentInfo);
        txtStudentInfo.setText("RollNo :"+Roll+",Name"+Student);
        getSupportActionBar().setTitle(tittle);
    }
}