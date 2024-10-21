package com.example.tcc;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;


public class InicialSc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciasc);
        TextView textView = findViewById(R.id.login);
        TextView textView1 = findViewById(R.id.assine);
        TextView textView2 = findViewById(R.id.assine2);
        TextView textView3 = findViewById(R.id.assine3);
        TextView textView4 = findViewById(R.id.assine4);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialSc.this, FormLogin.class);
                startActivity(it);


            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialSc.this, Pacote4.class);
                startActivity(it);


            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialSc.this, Pacote3.class);
                startActivity(it);


            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialSc.this, Pacote2.class);
                startActivity(it);


            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialSc.this, Pacote.class);
                startActivity(it);


            }
        });

    }}