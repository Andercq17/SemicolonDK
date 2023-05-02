package edu.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import edu.example.myapplication.R;


public class FlujoMagnetico extends AppCompatActivity {
    ImageButton btn_volver;
    Button btn_calc;
    TextView txt_respuesta;
    EditText txt_campo, txt_angulo, txt_area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flujo_magnetico);
        btn_volver = findViewById(R.id.imgBtn_volver);
        btn_calc=findViewById(R.id.btn_calcular);
        txt_respuesta=findViewById(R.id.txtCalculado);
        txt_angulo=findViewById(R.id.txt_angulo);
        txt_campo=findViewById(R.id.txt_campo);
        txt_area=findViewById(R.id.txt_area);



        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(FlujoMagnetico.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_campo.getText().toString()!="" ||txt_area.getText().toString()!=""||txt_angulo.getText().toString()!=""){
                    double calc=Double.parseDouble(txt_campo.getText().toString())*Double.parseDouble(txt_area.getText().toString())*Math.cos(Double.parseDouble(txt_angulo.getText().toString()));
                    //Toast.makeText(getApplicationContext(), String.valueOf(calc),Toast.LENGTH_LONG).show();
                    txt_respuesta.setText(String.valueOf(calc));
                    txt_angulo.setText("");
                    txt_area.setText("");
                    txt_campo.setText("");
                }else{
                    Toast.makeText(getApplicationContext(), "θ, B o A. Está vacío",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}