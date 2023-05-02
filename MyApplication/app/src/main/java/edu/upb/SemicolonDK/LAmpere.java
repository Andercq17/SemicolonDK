<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/LAmpere.java
package edu.example.myapplication;
========
package edu.upb.SemicolonDK;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/LAmpere.java

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/LAmpere.java
import edu.example.myapplication.R;

========
import edu.upb.SemicolonDK.R;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/LAmpere.java
public class LAmpere extends AppCompatActivity {
    ImageButton btn_volver;

    Button btn_calcular;
    TextView txt_calculado;
    EditText txt_dl, txt_corriente, txt_radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lampere);

        btn_volver = findViewById(R.id.imgBtn_volver);
        btn_calcular=findViewById(R.id.btn_calcular);
        txt_calculado=findViewById(R.id.txtCalculado);
        txt_dl=findViewById(R.id.txt_dl);
        txt_corriente=findViewById(R.id.txt_corriente);
        txt_radio=findViewById(R.id.txt_radio);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(LAmpere.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txt_corriente.getText().toString()!=""||txt_radio.getText().toString()!="" || txt_dl.getText().toString()!=""){
                    double calc=(((4*Math.PI)*Math.pow(10,-7))*Double.parseDouble(txt_corriente.getText().toString()))/(2*Math.PI*Double.parseDouble(txt_radio.getText().toString()));
                    txt_calculado.setText(String.valueOf(calc));
                    txt_radio.setText("");
                    txt_dl.setText("");
                    txt_corriente.setText("");
                }else{
                    Toast.makeText(getApplicationContext(), "θ, B o A. Está vacío",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}