package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.model.CaidaLibreModel;
import com.example.myapplication.model.MUAModel;

import java.util.ArrayList;

public class MUA extends AppCompatActivity {

    Button btn_calcular_mua;
    Spinner spn_opciones_mua;

    ImageButton btn_volver_mua;
    TextView txt_calculado_mua;
    EditText a, vo, vf, t, x;
    ArrayList<String> opciones_mua = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimiento_uniforme_acelerado);

        btn_calcular_mua = findViewById(R.id.btn_calcular_MUA);
        spn_opciones_mua = findViewById(R.id.spinner_MUA);
        txt_calculado_mua = findViewById(R.id.txt_calculado_MUA);
        btn_volver_mua = findViewById(R.id.imgbtn_volver_mua);

        a = findViewById(R.id.numA_MUA);
        vo = findViewById(R.id.numVini_MUA);
        vf = findViewById(R.id.numVfin_MUA);
        t = findViewById(R.id.numTi_MUA);
        x = findViewById(R.id.numDist_MUA);

        opciones_mua.add("Aceleración");
        opciones_mua.add("Velocidad Final");
        opciones_mua.add("Velocidad Inicial");
        opciones_mua.add("Tiempo");
        opciones_mua.add("Distancia");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,opciones_mua);
        spn_opciones_mua.setAdapter(adapter);

        btn_volver_mua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver_mua = new Intent(MUA.this, OpcionesMecanica.class);
                startActivity(volver_mua);
            }
        });

        btn_calcular_mua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(spn_opciones_mua.getSelectedItem().toString().equals("Aceleración")){

                    if(!vo.getText().toString().matches("") &&
                            !t.getText().toString().matches("") &&
                            !vf.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double tx = Double.parseDouble(t.getText().toString());
                            String res = MUAModel.getAT(vox, tx, vfx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                        }
                    }
                    else if(!vo.getText().toString().matches("") &&
                            !x.getText().toString().matches("") &&
                            !vf.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double xx = Double.parseDouble(x.getText().toString());
                            String res = MUAModel.getAX(vox, xx, vfx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                        }
                    }
                    else txt_calculado_mua.setText("Datos de entrada no válidos");

                }

                if(spn_opciones_mua.getSelectedItem().toString().equals("Velocidad Final")){

                    if(!vo.getText().toString().matches("") &&
                            !a.getText().toString().matches("") &&
                            !x.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double ax = Double.parseDouble(a.getText().toString());
                            double xx = Double.parseDouble(x.getText().toString());
                            String res = MUAModel.getVfX(vox, ax, xx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado_mua.setText("Datos de entrada no válidos");
                        }
                    }
                    else if(!vo.getText().toString().matches("") &&
                            !a.getText().toString().matches("") &&
                            !t.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double ax = Double.parseDouble(a.getText().toString());
                            double tx = Double.parseDouble(t.getText().toString());
                            String res = MUAModel.getVfT(vox, ax, tx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado_mua.setText("Datos de entrada no válidos");
                        }
                    }
                    else txt_calculado_mua.setText("Datos de entrada no válidos");
                }

                if(spn_opciones_mua.getSelectedItem().toString().equals("Distancia")){

                    if(!vo.getText().toString().matches("") &&
                            !vf.getText().toString().matches("") &&
                            !t.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double tx = Double.parseDouble(t.getText().toString());
                            String res = MUAModel.getXV(vox, vfx, tx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado_mua.setText("Datos de entrada no válidos");
                        }
                    }
                    else if(!vo.getText().toString().matches("") &&
                            !a.getText().toString().matches("") &&
                            !t.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double ax = Double.parseDouble(a.getText().toString());
                            double tx = Double.parseDouble(t.getText().toString());
                            String res = MUAModel.getXA(vox, tx, ax);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado_mua.setText("Datos de entrada no válidos");
                        }
                    }
                    else txt_calculado_mua.setText("Datos de entrada no válidos");
                }

                if(spn_opciones_mua.getSelectedItem().toString().equals("Tiempo")){

                    if(!vo.getText().toString().matches("") &&
                            !vf.getText().toString().matches("") &&
                            !x.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double xx = Double.parseDouble(x.getText().toString());
                            String res = MUAModel.getTVX(vox, xx, vfx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado_mua.setText("Datos de entrada no válidos");
                        }
                    }
                    else if(!vo.getText().toString().matches("") &&
                            !a.getText().toString().matches("") &&
                            !vf.getText().toString().matches("")){
                        try {
                            double vox = Double.parseDouble(vo.getText().toString());
                            double ax = Double.parseDouble(a.getText().toString());
                            double vfx = Double.parseDouble(vf.getText().toString());
                            String res = MUAModel.getTVA(vox, ax, vfx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado_mua.setText("Datos de entrada no válidos");
                        }
                    }
                    else txt_calculado_mua.setText("Datos de entrada no válidos");
                }

                if(spn_opciones_mua.getSelectedItem().toString().equals("Velocidad Inicial")){

                    if(!vf.getText().toString().matches("") &&
                            !a.getText().toString().matches("") &&
                            !x.getText().toString().matches("")){
                        try {
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double ax = Double.parseDouble(a.getText().toString());
                            double xx = Double.parseDouble(x.getText().toString());
                            String res = MUAModel.getVoAX(vfx, ax, xx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado_mua.setText("Datos de entrada no válidos");
                        }
                    }
                    else if(!vf.getText().toString().matches("") &&
                            !a.getText().toString().matches("") &&
                            !t.getText().toString().matches("")){
                        try {
                            double vfx = Double.parseDouble(vf.getText().toString());
                            double ax = Double.parseDouble(a.getText().toString());
                            double tx = Double.parseDouble(t.getText().toString());
                            String res = MUAModel.getVoAT(vfx, ax, tx);
                            txt_calculado_mua.setText(res);
                        }
                        catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            txt_calculado_mua.setText("Datos de entrada no válidos");
                        }
                    }
                    else txt_calculado_mua.setText("Datos de entrada no válidos");
                }




            }
        });
    }
}