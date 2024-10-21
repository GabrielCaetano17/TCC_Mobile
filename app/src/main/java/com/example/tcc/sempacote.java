package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class sempacote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sempacote);

        setContentView(R.layout.activity_assinado);
        ImageView textView = findViewById(R.id.perfil);
        TextView textView1 = findViewById(R.id.voltar);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(sempacote.this, InicialCc.class);
                startActivity(it);

            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(sempacote.this, Perfil.class);
                startActivity(it);

            }
        });

    }
}