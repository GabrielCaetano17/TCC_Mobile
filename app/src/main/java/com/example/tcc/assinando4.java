package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class assinando4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assinando);

        ImageView perfil = findViewById(R.id.perfil);
        ImageView voltar = findViewById(R.id.voltar);
        TextView N = findViewById(R.id.N);
        TextView S = findViewById(R.id.assine);

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(assinando4.this, Perfil.class);
                startActivity(it);

            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(assinando4.this, Pacote4.class);
                startActivity(it);

            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(assinando4.this, InicialCc.class);
                startActivity(it);

            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(assinando4.this, assinado4.class);
                startActivity(it);

            }
        });

    }

}