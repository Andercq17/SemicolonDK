package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LBiotSavart extends AppCompatActivity {
    ImageButton btn_volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbiot_savart);
        btn_volver = findViewById(R.id.imgBtn_volver);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(LBiotSavart.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });
    }
}