package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class pacoteass extends AppCompatActivity {


    String emailax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacoteass);
        ImageView perfil = findViewById(R.id.perfil);
        Button ass = (Button) findViewById(R.id.cancela);


        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(pacoteass.this, Perfil.class);
                startActivity(it);

            }
        });

        ass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int reposta = 0;
                Intent t = getIntent();
                emailax = t.getStringExtra("email");

                String emailex = emailax;

                String query = "delete Assinatura where emailUsu = " +  "'"  + emailex  + "'";
                try {
                    PreparedStatement preparedStatement = Conexao.conectar(pacoteass.this).prepareStatement(query);
                    reposta = preparedStatement.executeUpdate();
                } catch (SQLException e) {
                    e.getMessage();
                }
                Intent it = new Intent(pacoteass.this, InicialCc.class);
                startActivity(it);

            }
        });



    }
}