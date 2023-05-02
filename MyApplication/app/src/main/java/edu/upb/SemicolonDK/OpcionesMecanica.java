<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/OpcionesMecanica.java
package edu.example.myapplication;
========
package edu.upb.SemicolonDK;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/OpcionesMecanica.java

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/OpcionesMecanica.java
import edu.example.myapplication.R;

========

import edu.upb.SemicolonDK.R;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/OpcionesMecanica.java
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