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

public class HelmHoltz extends AppCompatActivity {
    ImageButton btn_volver;
    Button btn_calcular;
    TextView txt_calculado;
    EditText txt_campo, txt_espiras, txt_corriente, txt_radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helm_holtz);
        btn_volver = findViewById(R.id.imgBtn_volver);
        btn_calcular=findViewById(R.id.btn_calcular);
        txt_calculado=findViewById(R.id.txtCalculado);
        txt_espiras=findViewById(R.id.txt_espiras);
        txt_campo=findViewById(R.id.txt_campo);
        txt_corriente=findViewById(R.id.txt_corriente);
        txt_radio=findViewById(R.id.txt_radio);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(HelmHoltz.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txt_campo.getText().toString()!="" ||txt_corriente.getText().toString()!=""||txt_espiras.getText().toString()!=""||txt_radio.getText().toString()!=""){
                    double calc=((0.72)*((4*Math.PI)*Math.pow(10,-7))*Double.parseDouble(txt_corriente.getText().toString())*Double.parseDouble(txt_espiras.getText().toString()))/Double.parseDouble(txt_radio.getText().toString());
                    txt_calculado.setText(String.valueOf(calc));

                    txt_espiras.setText("");
                    txt_corriente.setText("");
                    txt_radio.setText("");
                    txt_campo.setText("");
                }else{
                    Toast.makeText(getApplicationContext(), "θ, B o A. Está vacío",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}