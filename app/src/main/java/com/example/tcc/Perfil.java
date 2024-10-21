package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class Perfil extends AppCompatActivity {

    private String email;

    private String nome;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        TextView textView = findViewById(R.id.voltar);
        TextView sair = findViewById(R.id.sair);
        TextView txtemail = findViewById(R.id.txtemail_perfil);
        TextView txtnome = findViewById(R.id.nomep);
        TextView ass = findViewById(R.id.ass);

        Intent it = getIntent();
        email = it.getStringExtra("email");
        txtemail.setText(email);
        nome = it.getStringExtra("nome");
        txtnome.setText(nome);


        Snackbar.make(txtemail, "Bem-vindo " + nome, Snackbar.LENGTH_LONG).show();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Perfil.this, InicialCc.class);
                startActivity(it);

            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Perfil.this, InicialSc.class);
                startActivity(it);

            }
        });

        ass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Perfil.this, pacoteass.class);
                it.putExtra("email", email);
                startActivity(it);

            }
        });
    }
}