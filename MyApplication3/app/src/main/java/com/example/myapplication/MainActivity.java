package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper viewFlipper;
    Button next;
    Button prevoius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        next = (Button) findViewById(R.id.next);
        prevoius =(Button)  findViewById(R.id.previous);

        next.setOnClickListener(this);
        prevoius.setOnClickListener(this);
    }
    public void onClick( View v){
        if (v == next){
            viewFlipper.showNext();
        } else if (v== prevoius) {
            viewFlipper.showPrevious();
        }
    }

}