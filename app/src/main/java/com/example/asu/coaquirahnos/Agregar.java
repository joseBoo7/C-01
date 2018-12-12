package com.example.asu.coaquirahnos;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Agregar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//EVITA que gire el activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        Menu menu=navigation.getMenu();//llamamos al menu de nuestra barra
        MenuItem menuItem=menu.getItem(2).setChecked(true);//true para que se marque nuestro boton numero 0
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);//iniciamos la accion de los botones
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent dato= new Intent(Agregar.this,MainActivity.class);
                    startActivity(dato);
                    return true;
                case R.id.navigation_dashboard:
                    Intent dato2= new Intent(Agregar.this,Lista.class);
                    startActivity(dato2);
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };




}
