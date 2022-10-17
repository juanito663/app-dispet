package com.example.mia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v){
        Toast.makeText(this, "ingreso exitoso", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,Principal1.class);
        startActivity(i);
    }

}