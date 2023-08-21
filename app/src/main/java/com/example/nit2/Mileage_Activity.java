package com.example.nit2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Mileage_Activity extends AppCompatActivity {
    ImageView limg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mileage);

        limg = findViewById(R.id.limg);
        limg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent limgView = new Intent(getApplicationContext(), Mypage_Activity.class);
                startActivity(limgView);
            }
        });

    }
}
