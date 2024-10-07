package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        TextView textView = findViewById(R.id.voltar);
        TextView sair = findViewById(R.id.sair);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView ass = findViewById(R.id.ass);
        View View  = findViewById(R.id.assinatura);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(perfil.this, InicialCc.class);
                startActivity(it);
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(perfil.this, InicialSc.class);
                startActivity(it);
            }
        });

        ass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(perfil.this, pacoteass.class);
                startActivity(it);
            }
        });

       View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(perfil.this, pacoteass.class);
                startActivity(it);
            }
        });

    }
}