<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/MainMenu.java
package edu.example.myapplication;
========
package edu.upb.SemicolonDK;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/MainMenu.java

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/MainMenu.java
import edu.example.myapplication.R;
========
import edu.upb.SemicolonDK.R;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/MainMenu.java

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