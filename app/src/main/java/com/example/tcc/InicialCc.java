package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InicialCc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial_cc);
        ImageView textView = findViewById(R.id.perfil);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView suple = findViewById(R.id.suplemento);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialCc.this, perfil.class);
                startActivity(it);
            }
        });

        suple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(InicialCc.this, Pacote.class);
                startActivity(it);
            }
        });

    }
}