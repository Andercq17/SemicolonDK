package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FlujoMagnetico extends AppCompatActivity {
    ImageButton btn_volver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flujo_magnetico);
        btn_volver = findViewById(R.id.imgBtn_volver);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(FlujoMagnetico.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });
    }
}