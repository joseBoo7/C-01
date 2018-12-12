package com.example.asu.coaquirahnos;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.TextView;

import java.util.regex.Pattern;

public class formulario extends AppCompatActivity {
    TextView vista;

    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        Intent recibir = getIntent();
        String datos = recibir.getStringExtra("ele");
        vista=(TextView)findViewById(R.id.servicio);
        vista.setText(datos);
    }

    private boolean validarEmail(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

}
