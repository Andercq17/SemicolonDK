<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/Splash.java
package edu.example.myapplication;
========
package edu.upb.SemicolonDK;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/Splash.java

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

<<<<<<<< HEAD:MyApplication/app/src/main/java/edu/example/myapplication/Splash.java
import edu.example.myapplication.R;
========
import edu.upb.SemicolonDK.R;
>>>>>>>> 94ba4b931d5f29b06966142beb2ae2404bf92da3:MyApplication/app/src/main/java/edu/upb/SemicolonDK/Splash.java

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent next = new Intent(Splash.this, MainMenu.class);
                startActivity(next);
                Splash.this.finish();
            }
        }, 3000);
    }
}