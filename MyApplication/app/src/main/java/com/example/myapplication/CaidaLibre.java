package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.model.CaidaLibreModel;

import java.util.ArrayList;

public class CaidaLibre extends AppCompatActivity {

    Button btn_calcular;
    Spinner spn_opciones;


    TextView txt_calculado;
    EditText h, vo, vf, t;
    ArrayList<String> opciones = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caida_libre);

        btn_calcular = findViewById(R.id.btnCalcular);
        spn_opciones = findViewById(R.id.spinnerCL);
        txt_calculado = findViewById(R.id.txtCalculado);
        h = findViewById(R.id.numH);
        vo = findViewById(R.id.numVo);
        vf = findViewById(R.id.numVf);
        t = findViewById(R.id.numT);

        opciones.add("Altura");
        opciones.add("Velocidad Final");
        opciones.add("Velocidad Inicial");
        opciones.add("Tiempo");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,opciones);
        spn_opciones.setAdapter(adapter);

        btn_calcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(spn_opciones.getSelectedItem().toString().equals("Altura")){

                    if(!vo.getText().toString().matches("") && !t.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double tx = Double.parseDouble(t.getText().toString());
                            String res = CaidaLibreModel.getH(vox, tx);
                            txt_calculado.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                        }
                    }

                }

                if(spn_opciones.getSelectedItem().toString().equals("Velocidad Final")){

                    if(!vo.getText().toString().matches("") && !t.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double tx = Double.parseDouble(t.getText().toString());
                            String res = CaidaLibreModel.getVfT(vox, tx);
                            txt_calculado.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado.setText("Datos de entrada no válidos");
                        }

                    } else if (!vo.getText().toString().matches("") && !h.getText().toString().matches("")) {
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double hx = Double.parseDouble(h.getText().toString());
                            String res = CaidaLibreModel.getVfH(vox, hx);
                            txt_calculado.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado.setText("Datos de entrada no válidos");
                        }
                    }

                }

                if(spn_opciones.getSelectedItem().toString().equals("Velocidad Inicial")){

                    if(!vf.getText().toString().matches("") && !t.getText().toString().matches("")){
                        try {
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double tx = Double.parseDouble(t.getText().toString());
                            String res = CaidaLibreModel.getVoT(vfx, tx);
                            txt_calculado.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado.setText("Datos de entrada no válidos");
                        }

                    } else if (!vf.getText().toString().matches("") && !h.getText().toString().matches("")) {
                        try {
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double hx = Double.parseDouble(h.getText().toString());
                            String res = CaidaLibreModel.getVoH(vfx, hx);
                            txt_calculado.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado.setText("Datos de entrada no válidos");
                        }
                    }

                }

                if(spn_opciones.getSelectedItem().toString().equals("Tiempo")){

                    if(!vf.getText().toString().matches("") && !vo.getText().toString().matches("")){
                        try {
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double vox = Double.parseDouble(vo.getText().toString());
                            String res = CaidaLibreModel.getT(vfx, vox);
                            txt_calculado.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado.setText("Datos de entrada no válidos");
                        }

                    }

                }
            }
        });

    }




}