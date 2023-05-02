<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/OpcionesMagnetismo.java
package edu.example.myapplication;
========
package edu.upb.SemicolonDK;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/OpcionesMagnetismo.java

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/OpcionesMagnetismo.java
import edu.example.myapplication.R;
========
import edu.upb.SemicolonDK.R;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/OpcionesMagnetismo.java

public class OpcionesMagnetismo extends AppCompatActivity {
    Button btn_formulas, btn_fmcorriente, btn_fmcarga, btn_ampere, btn_helm, btn_flujo;
    ImageButton btn_volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_magnetismo);
        btn_ampere = findViewById(R.id.btn_ley_ampere);
        btn_flujo = findViewById(R.id.btn_flujo);
        btn_fmcarga = findViewById(R.id.btn_fm_carga);
        btn_fmcorriente = findViewById(R.id.btn_fm_corriente);
        btn_formulas = findViewById(R.id.btn_formulas);
        btn_helm = findViewById(R.id.btn_bobinas);
        btn_volver = findViewById(R.id.imgBtn_volver);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(OpcionesMagnetismo.this, MainMenu.class);
                startActivity(menu);
            }
        });
        btn_ampere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lampere = new Intent(OpcionesMagnetismo.this, LAmpere.class);
                startActivity(lampere);
            }
        });
        btn_helm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bobinas = new Intent(OpcionesMagnetismo.this, HelmHoltz.class);
                startActivity(bobinas);
            }
        });
        btn_flujo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent flujo = new Intent(OpcionesMagnetismo.this, FlujoMagnetico.class);
                startActivity(flujo);
            }
        });
        btn_formulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formulas = new Intent(OpcionesMagnetismo.this, Formulas.class);
                startActivity(formulas);
            }
        });
        btn_fmcorriente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fmcorriente = new Intent(OpcionesMagnetismo.this, FMCorriente.class);
                startActivity(fmcorriente);
            }
        });
        btn_fmcarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fmcarga = new Intent(OpcionesMagnetismo.this, FMCarga.class);
                startActivity(fmcarga);
            }
        });
    }
}