<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/Formulas.java
package edu.example.myapplication;
========
package edu.upb.SemicolonDK;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/Formulas.java

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/Formulas.java
import edu.example.myapplication.R;

========

import edu.upb.SemicolonDK.R;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/Formulas.java
public class Formulas extends AppCompatActivity {
    ImageButton btn_volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas);
        btn_volver = findViewById(R.id.imgBtn_volver);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(Formulas.this, OpcionesMagnetismo.class);
                startActivity(menu);
            }
        });
    }
}