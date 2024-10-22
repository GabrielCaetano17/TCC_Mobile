package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class assinando2 extends AppCompatActivity {
private String email;

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
                Intent it = new Intent(assinando2.this, Perfil.class);
                startActivity(it);

            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(assinando2.this, Pacote2.class);
                startActivity(it);

            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(assinando2.this, InicialCc.class);
                startActivity(it);

            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(assinando2.this, assinado2.class);
                startActivity(it);

            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int reposta = 0;
                Intent t = getIntent();
                email = t.getStringExtra("email");

                String emailAss = email;
                String query = "INSERT Assinatura (dataAssinatura,codigo, emailUsu, kit_id,valor, statusAssinatura)" +
                        "VALUES (GETDATE(),'1234567890', "+ "'" + emailAss + "'" + ", 2, 159.00 , 'INATIVO')";
                try {
                    PreparedStatement preparedStatement = Conexao.conectar(assinando2.this).prepareStatement(query);

                    reposta = preparedStatement.executeUpdate();


                } catch (SQLException e) {
                    e.getMessage();
                }

                Intent it = new Intent(assinando2.this, assinado.class);
                startActivity(it);

            }
        });

    }

}