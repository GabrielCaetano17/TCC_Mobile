package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Pacote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacote);


        String email;
        ImageView perfil = findViewById(R.id.perfil);
        TextView ass = findViewById(R.id.assine);
        email = getIntent().getExtras().getString("email");

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Pacote.this, Perfil.class);
                startActivity(it);

            }
        });

        ass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Pacote.this, assinando.class);
                it.putExtra("email", email);
                startActivity(it);

            }
        });
    }
}