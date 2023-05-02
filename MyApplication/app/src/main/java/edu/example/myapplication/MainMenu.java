package edu.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.example.myapplication.R;

public class MainMenu extends AppCompatActivity {

    Button btn_OMag;
    Button btn_OM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        btn_OM = findViewById(R.id.btn_mecanica);
        btn_OMag = findViewById(R.id.btn_electro);
        btn_OMag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OMag = new Intent(MainMenu.this, OpcionesMagnetismo.class);
                startActivity(OMag);
            }
        });
        btn_OM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toOM = new Intent(MainMenu.this, OpcionesMecanica.class);
                startActivity(toOM);
            }
        });
    }
}