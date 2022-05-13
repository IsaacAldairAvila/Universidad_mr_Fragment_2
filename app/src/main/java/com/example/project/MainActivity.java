package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button verde, azul, purpura;

    BLUEFR fragmentazul;
    GREENFR fragmentverde;
    PURPLEFR fragmentpurpura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentazul = new BLUEFR();
        fragmentpurpura =new PURPLEFR();
        fragmentverde = new GREENFR();
        verde = (Button) findViewById(R.id.btgreen);
        azul = (Button) findViewById(R.id.btblue);
        purpura = (Button) findViewById(R.id.btpurple);


        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmentverde).commit();

        verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor, fragmentverde);
                transaction.commit();
            }
        });
        azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor, fragmentazul);
                transaction.commit();
            }
        });
        purpura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor, fragmentpurpura);
                transaction.commit();
            }
        });

    }
}