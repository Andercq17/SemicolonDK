package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcionesMecanica extends AppCompatActivity {

    Button btn_CL, btn_MUA, btn_VLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_mecanica);

        btn_CL = findViewById(R.id.btnCL);
        btn_MUA = findViewById(R.id.btnMUA);
        btn_VLV = findViewById(R.id.btnVolver);

        btn_CL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toCL = new Intent(OpcionesMecanica.this, CaidaLibre.class);
                startActivity(toCL);
            }
        });

        btn_MUA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toMUA = new Intent(OpcionesMecanica.this, MUA.class);
                startActivity(toMUA);
            }
        });

        btn_VLV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toMenu = new Intent(OpcionesMecanica.this, MainMenu.class);
                startActivity(toMenu);
            }
        });

    }
}