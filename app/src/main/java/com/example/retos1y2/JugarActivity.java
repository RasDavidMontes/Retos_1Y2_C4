package com.example.retos1y2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JugarActivity extends AppCompatActivity {

    private Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);


        btnregresar = findViewById(R.id.btn_play);
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //Regresa a la actividad principal...
    public void regresarJugar(View view) {
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity( regresar);
    }

}