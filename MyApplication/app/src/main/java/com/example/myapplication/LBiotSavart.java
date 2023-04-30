package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class LBiotSavart extends AppCompatActivity {
    ImageButton btn_volver;
    Spinner spn_opciones;
    ArrayList<String> opciones = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbiot_savart);
        btn_volver = findViewById(R.id.imgBtn_volver);
        opciones.add("dl");
        opciones.add("I");
        opciones.add("B");
        opciones.add("θ");
        opciones.add("R");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,opciones);
        spn_opciones.setAdapter(adapter);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(LBiotSavart.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });
    }
}