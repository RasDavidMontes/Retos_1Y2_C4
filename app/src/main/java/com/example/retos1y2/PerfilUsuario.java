package com.example.retos1y2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerfilUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
    }

    //Regresa a la actividad principal...
    public void regresarPerfil(View view) {

        Intent regresar = new Intent(this, MainActivity.class);
        startActivity( regresar);
    }

}