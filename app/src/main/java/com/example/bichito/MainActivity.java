package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void  onResume(){
        super.onResume();
        //En este punto la aplicacion ya cargo:

        //This en un activity: es la escencia de una pantalla
        //This es un tipo contexto

        Toast.makeText(this,
                "Aplicacion Iniciada",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop(); //Este codigo se ejecuto antes de todos.
        Toast.makeText(this,
                "Aplicacion Stopeada",
                Toast.LENGTH_LONG).show();
    }
}
