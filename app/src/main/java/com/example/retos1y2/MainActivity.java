package com.example.retos1y2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Creación de contenedores para los datos recibidos en los campos de texto...
    private EditText username=null, password=null;
    private MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(findViewById(R.id.toolbar));

        //Agregar las referencias para poder usar los botones...
        username= findViewById( R.id.edit_usuario);
        password= findViewById( R.id.edit_contraseña);

        //Button btn = findViewById(R.id.btn_perfil);
        //Button btnplay = findViewById(R.id.btn_play);
        //Button btn_regresar = findViewById(R.id.btn_regresar);
    }

    public void playGame( View view){
        Intent play_game= new Intent( this, JugarActivity.class);
        startActivity(play_game);
    }

    public void ajustes( View view) {
        //Intent play_game = new Intent(this, AjustesActivity.class);
        //startActivity(play_game);
    }

    public void perfil_user( View view){
        if( username.getText().toString().equals("User") ){
            if( password.getText().toString().equals( "1234") ){
                Intent perfil= new Intent( this, PerfilUsuario.class);
                startActivity(perfil);
            }
        }else{
            Toast.makeText(this, "Clave incorrecta.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.manu_main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        CharSequence itm_title = item.getTitle();
        //System.out.println("Item Title: "+ itm_title);
        switch (itm_title.toString()){
            case "Search":
                System.out.println("Se oprimió el botón Search");
                break;
            case "Preferences":
                System.out.println("Se oprimió el botón Preferences");
                break;
            case "Logout":
                System.out.println("Se oprimió el botón Logout");
                break;
            default:
                System.out.println("Se oprimió un botón desconocido para el sistema.");
                System.out.println("BtnTitleName: "+item.getIcon().toString());
                break;
        }
        return super.onOptionsItemSelected(null);
    }
}



/*
*
    @Override
    public boolean onOptionsItemSelected(){
        //vOLVER A HACER ESTE CODIGO EN CASO DE REINICIO
    }
* */