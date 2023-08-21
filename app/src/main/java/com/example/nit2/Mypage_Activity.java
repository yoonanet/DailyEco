package com.example.nit2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Mypage_Activity extends AppCompatActivity{
    Button partBtn;
    ImageView limg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);

        partBtn = findViewById(R.id.partBtn);
        partBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mpintent = new Intent(getApplicationContext(),Mileage_Activity.class);
                startActivity(mpintent);
            }
        });

        limg = findViewById(R.id.limg);
        limg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent limgView = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(limgView);
            }
        });
    }
}
