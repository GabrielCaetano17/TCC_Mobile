package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.w3c.dom.Text;

public class FormLogin extends AppCompatActivity {

    EditText email, senha;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        //botão para salvar os dados
        Button btnSalvar = (Button) findViewById(R.id.entrar);
        TextView textView1 = findViewById(R.id.tstCadastro);
        TextView textView2 = findViewById(R.id.esqueceu);
        email = (EditText) findViewById(R.id.email);
        senha = (EditText) findViewById(R.id.senha);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(it);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FormLogin.this, email.class);
                startActivity(it);
            }
        });

      btnSalvar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String Email = email.getText().toString().trim();
              String Senha = senha.getText().toString().trim();

              if (!Email.isEmpty() && !Senha.isEmpty()) {
                  new LoginTask().execute(Email, Senha);
              } else {
                  Toast.makeText(FormLogin.this, "por favor coloque os seus dados de forma correta", Toast.LENGTH_SHORT).show();
              }
          }
      });
        }
        private class LoginTask extends AsyncTask<String, Void, Boolean> {
        @Override
            protected Boolean doInBackground(String... params) {
            String Email = params[0];
            String Senha = params[1];

            String url = "jdbc:jtds:sqlserver://172.19.1.43;databaseName=bd_Kitfit;";
            String user = "sa";
            String pass = "@ITB123456";

            try {
                String query = "Select nome, email From Usuario where email = ? AND senha = ?";
                PreparedStatement preparedStatement = Conexao.conectar(FormLogin.this).prepareStatement(query);
                preparedStatement.setString(1, Email);
                preparedStatement.setString(2, Senha);
                ResultSet resultSet = preparedStatement.executeQuery();
                boolean validLogin = resultSet.next();
                resultSet.close();
                preparedStatement.close();
                return  validLogin;
            }catch (Exception e){
                e.printStackTrace();
                return false;
            }
        }
        @Override
            protected void onPostExecute(Boolean sucess) {
            if (sucess) {
                Toast.makeText(FormLogin.this, "login realizado", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(FormLogin.this, InicialCc.class);
                it.putExtra("email", email.getText().toString());
                it.putExtra("senha", senha.getText().toString());
                startActivity(it);
                finish();
            } else {
                Toast.makeText(FormLogin.this, "por favor coloque os seus dados de forma correta", Toast.LENGTH_SHORT).show();
            }
        }
        }

    }
