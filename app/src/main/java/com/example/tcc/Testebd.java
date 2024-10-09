package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import java.sql.Connection;
import java.sql.SQLException;

public class Testebd extends AppCompatActivity {

    TextView teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);


        Context ctx = null;
        Connection conn = Conexao.conectar(ctx);
        teste = findViewById(R.id.Teste);

        try {
            if(conn != null) {
                if (!conn.isClosed())
                    teste.setText("Conectado");
                else
                    teste.setText("Conexão Fechada");
            }
            else {
                teste.setText("Conexão Nula");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            teste.setText("Conexão Falhou\n" +
                    ex.getMessage());
        }

    }
}

