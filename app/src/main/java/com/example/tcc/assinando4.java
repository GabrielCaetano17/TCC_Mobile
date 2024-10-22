package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class assinando4 extends AppCompatActivity {
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
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int reposta = 0;
                Intent t = getIntent();
                email = t.getStringExtra("email");

                String emailAss = email;
                String query = "INSERT Assinatura (dataAssinatura,codigo, emailUsu, kit_id,valor, statusAssinatura)" +
                        "VALUES (GETDATE(),'1234567890', "+ "'" + emailAss + "'" + ", 4, 159.00 , 'INATIVO')";
                try {
                    PreparedStatement preparedStatement = Conexao.conectar(assinando4.this).prepareStatement(query);

                    reposta = preparedStatement.executeUpdate();


                } catch (SQLException e) {
                    e.getMessage();
                }

                Intent it = new Intent(assinando4.this, assinado.class);
                startActivity(it);

            }
        });

    }

}