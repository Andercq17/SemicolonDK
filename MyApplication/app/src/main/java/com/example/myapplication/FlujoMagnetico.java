package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FlujoMagnetico extends AppCompatActivity {
    ImageButton btn_volver;
    Spinner spn_opciones;
    TextView txt_respuesta;
    ArrayList<String> opciones = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flujo_magnetico);
        btn_volver = findViewById(R.id.imgBtn_volver);
        txt_respuesta=findViewById(R.id.txt_res);
        spn_opciones=findViewById(R.id.cb);

        opciones.add("θ");
        opciones.add("φ");
        opciones.add("B");
        opciones.add("A");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,opciones);
        spn_opciones.setAdapter(adapter);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(FlujoMagnetico.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });

        spn_opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spn_opciones.getSelectedItem().toString()=="θ"){
                    String perro="θ";
                    Toast.makeText(getApplicationContext(),"θ",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"otro",Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
//        String text = spn_opciones.getSelectedItem().toString();

    }
}