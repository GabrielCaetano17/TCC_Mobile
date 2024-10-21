package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Senha extends AppCompatActivity {

    EditText senha, repetir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senha);
        String email;

        Intent t = getIntent();
        email = t.getStringExtra("email");

      Button btnEntrar = (Button) findViewById(R.id.trocar_senha);

         senha = (EditText) findViewById(R.id.senha_troca);
         repetir = (EditText) findViewById(R.id.repetir_troca);




        btnEntrar.setOnClickListener(new View.OnClickListener() {


            //irá verificar se os campos estão vazio
            @Override
            public void onClick(View v) {
                String erros = validar();

                String senhaN = senha.getText().toString().trim();

                String emailA = email;

                int reposta = 0;

                if (erros.equals("")) {

                    String query = "update Usuario set senha = " + "'" + senhaN + "'" +"  where email = "+ "'" +emailA + "'";
                    try {
                        PreparedStatement preparedStatement = Conexao.conectar(Senha.this).prepareStatement(query);

                        reposta = preparedStatement.executeUpdate();


                    } catch (SQLException e) {
                        e.getMessage();
                    }
                    Intent it = new Intent(com.example.tcc.Senha.this, confirm.class);
                    startActivity(it);
                } else {
                    erros = "";
                }

            }

            });

        }

    public String validar() {
        String erros = "";


        if (senha.getText().toString().equals("")) {
            erros = erros + "" +
                    "A Senha é obrigatório\n";
            senha.setError("Este campo é obrigatório");
        }

        if (repetir.getText().toString().equals("")) {
            erros = erros + "repetir a Senha é obrigatório\n";
            senha.setError("Este campo é obrigatório");
        }

        String senhaRecebida = senha.getText().toString().trim();
        String repetirRecebido = repetir.getText().toString();

        if (!senhaRecebida.equals(repetirRecebido)) {
            erros = erros + "repita a mesma senha\n";
            repetir.setError("coloque a senha novamente");
        }



        return erros;

    }
    }
