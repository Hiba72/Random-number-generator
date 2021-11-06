package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int rand;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.clickButton);
        Button btn1=findViewById(R.id.share);
        Button btn2=findViewById(R.id.dial);
        Button btn3 =findViewById(R.id.web);
        TextView randomText=findViewById(R.id.randomNumber);

        Random random=new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             rand=random.nextInt(100);
             randomText.setText(String.valueOf(rand));

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String message = randomText.getText().toString();
             intent=new Intent();
             intent.setAction(Intent.ACTION_SEND);
             intent.setType("text/plain");
             intent.putExtra(intent.EXTRA_TEXT,message);
             startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("tel:+923244394467");
                Intent intent1=new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent1);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage=Uri.parse("https://github.com/Hiba72/Random-number-generator");
                Intent intent2=new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(intent2);
            }
        });
    }
}