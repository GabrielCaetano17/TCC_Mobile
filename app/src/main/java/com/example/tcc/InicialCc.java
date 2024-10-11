package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InicialCc extends AppCompatActivity {

    private String nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial_cc);
        ImageView textView = findViewById(R.id.perfil);
        TextView textView1 = findViewById(R.id.assine);
        TextView textView2 = findViewById(R.id.assine2);
        TextView textView3 = findViewById(R.id.assine3);
        TextView textView4 = findViewById(R.id.assine4);

        String email, senha;
        email = getIntent().getExtras().getString("email");
        senha = getIntent().getExtras().getString("senha");


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialCc.this, perfil.class);
                it.putExtra("email", email);
                it.putExtra("senha", senha);
                startActivity(it);
            }
        });


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialCc.this, Pacote.class);
                startActivity(it);

            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialCc.this, Pacote.class);
                startActivity(it);

            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialCc.this, Pacote.class);
                startActivity(it);

            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialCc.this, Pacote.class);
                startActivity(it);

            }
        });

    }
}