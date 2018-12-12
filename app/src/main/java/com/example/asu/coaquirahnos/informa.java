package com.example.asu.coaquirahnos;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class informa extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent dato= new Intent(informa.this,MainActivity.class);
                    startActivity(dato);
                    return true;
                case R.id.navigation_dashboard:
                    Intent dato2= new Intent(informa.this,Lista.class);
                    startActivity(dato2);
                    return true;
                case R.id.navigation_notifications:
                    Intent dato3= new Intent(informa.this,Agregar.class);
                    startActivity(dato3);
                    return true;
            }
            return false;
        }
    };
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informa);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);//iniciamos la accion de los botones
    }
    public void agregar(View view){
        Intent dato= new Intent(this,Agregar.class);
        startActivity(dato);
    }
    public void homeSoli(View view){
        Intent dato= new Intent(this,formulario.class);
        startActivity(dato);
    }
    public void lista(View view){
        Intent dato= new Intent(this,Lista.class);
        startActivity(dato);
    }
}
