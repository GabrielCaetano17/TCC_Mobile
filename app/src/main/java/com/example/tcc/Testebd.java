package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.sql.Connection;

public class Testebd extends AppCompatActivity {

    TextView teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        Connection conn = Conexao.conectar(ctx);
        teste = findViewById(R.id.Teste);

        try {
            if(conn != null) {
                if (!conn.isClosed())
                    teste.setText("conectado");
                else
                    teste.setText("conexão fechada");
            }
            else {
                teste.setText("conexão nula");
            }
        }
        catch (java.sql.SQLException ex) {
            ex.printStackTrace();
            teste.setText("conexão falhou\n" +
                    ex.getMessage());
        }

    }
}

