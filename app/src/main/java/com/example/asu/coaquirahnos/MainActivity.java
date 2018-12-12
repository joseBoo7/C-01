package com.example.asu.coaquirahnos;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    Intent dato2= new Intent(MainActivity.this,Lista.class);
                    startActivity(dato2);
                    return true;
                case R.id.navigation_notifications:
                    Intent dato3= new Intent(MainActivity.this,Agregar.class);
                    startActivity(dato3);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        Menu menu=navigation.getMenu();//llamamos al menu de nuestra barra
        MenuItem menuItem=menu.getItem(0).setChecked(true);//true para que se marque nuestro boton numero 0
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);//iniciamos la accion de los botones
    }
    public void informa(View view){
        Intent dato= new Intent(this,informa.class);
        startActivity(dato);
    }
    public void subirIma(View view){
        Intent dato= new Intent(this,Imagen.class);
        startActivity(dato);
    }
    public void homeSoli(View view){
        Toast.makeText(this, "Solicitud Enviada", Toast.LENGTH_SHORT).show();
        Intent dato= new Intent(this,MainActivity.class);
        startActivity(dato);
    }


}
