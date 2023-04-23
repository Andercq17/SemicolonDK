package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button btn_OM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        btn_OM = findViewById(R.id.btn_mecanica);

        btn_OM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toOM = new Intent(MainMenu.this, OpcionesMecanica.class);
                startActivity(toOM);
            }
        });
    }
}