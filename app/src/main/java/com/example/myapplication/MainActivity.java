package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.clickButton);
        TextView randomText=findViewById(R.id.randomNumber);

        Random random=new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             rand=random.nextInt(100);
             randomText.setText(String.valueOf(rand));
            }
        });

    }
}