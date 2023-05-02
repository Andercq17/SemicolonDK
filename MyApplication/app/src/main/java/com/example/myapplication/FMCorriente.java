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
import android.widget.Toast;

import java.util.ArrayList;

public class FMCorriente extends AppCompatActivity {
    ImageButton btn_volver;
    Button btn_calcular;
    TextView txt_calculado;
    EditText txt_campo, txt_angulo, txt_corriente, txt_longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmcorriente);
        btn_volver = findViewById(R.id.imgBtn_volver);
        btn_calcular=findViewById(R.id.btn_calcular);
        txt_calculado=findViewById(R.id.txtCalculado);
        txt_angulo=findViewById(R.id.txt_angulo);
        txt_campo=findViewById(R.id.txt_campo);
        txt_corriente=findViewById(R.id.txt_corriente);
        txt_longitud=findViewById(R.id.txt_longitud);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txt_campo.getText().toString()!="" ||txt_corriente.getText().toString()!=""||txt_angulo.getText().toString()!=""||txt_longitud.getText().toString()!=""){
                    double calc=Double.parseDouble(txt_corriente.getText().toString())*Double.parseDouble(txt_longitud.getText().toString())*Double.parseDouble(txt_campo.getText().toString())*Math.sin(Double.parseDouble(txt_angulo.getText().toString()));
                    txt_calculado.setText(String.valueOf(calc));

                    txt_angulo.setText("");
                    txt_corriente.setText("");
                    txt_longitud.setText("");
                    txt_campo.setText("");
                }else{
                    Toast.makeText(getApplicationContext(), "θ, B o A. Está vacío",Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(FMCorriente.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });
    }
}