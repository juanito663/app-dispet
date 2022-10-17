package com.example.mia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Principal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal1);


        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl .addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //codificar cosas a ejecutar cuando le das tap a un tab
                int position = tab.getPosition();
                switch (position){
                    case 0:
                        Comida c = new Comida();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,c).commit();
                        break;

                    case 1:
                        Registros r = new Registros();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,r).commit();
                        break;

                    case 2:
                        Sensores s = new Sensores();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,s).commit();
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //codificar cosas a ejecutar cuando un tab deja de estar seleccionado
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //codificar cosas a ejecutar cuando un tab se vuelve a seleccionar
            }
        });


    }
}