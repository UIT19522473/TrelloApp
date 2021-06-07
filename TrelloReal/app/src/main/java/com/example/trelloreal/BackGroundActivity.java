package com.example.trelloreal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BackGroundActivity extends AppCompatActivity {
    ImageButton btnBack;
    ImageView imgColor,imgScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_ground);

        AnhXa();
        OnClickAll();


    }

    private void AnhXa(){
        btnBack = findViewById(R.id.imgBtnBack);
        imgColor = findViewById(R.id.imgColor);
        imgScreen = findViewById(R.id.imgScreen);
    }

    private void OnClickAll(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        imgScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BackGroundActivity.this, ChoseScreenActivity.class);
                startActivity(intent);
            }
        });

        imgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BackGroundActivity.this, ChoseColorActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}