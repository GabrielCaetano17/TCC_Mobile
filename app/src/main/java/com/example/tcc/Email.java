package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Email extends AppCompatActivity {

    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);



        Button bnt = (Button) findViewById(R.id.entrar);
       EditText emailr = (EditText) findViewById(R.id.email);



        bnt.setOnClickListener(new View.OnClickListener() {
            //irá verificar se os campos estão vazio
            @Override
            public void onClick(View v) {
                String Emailr = emailr.getText().toString().trim();
                if (!Emailr.isEmpty()) {
                    new Email.LoginTask().execute(Emailr);
                } else {
                    Toast.makeText(Email.this, "por favor coloque os seus dados de forma correta", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private class LoginTask extends AsyncTask<String, Void, Boolean> {


        @Override
        protected Boolean doInBackground(String... params) {
            String Emailr = params[0];

            boolean validLogin = false;

            try {
                String query = "Select email From Usuario where email = ?";
                PreparedStatement preparedStatement = Conexao.conectar(Email.this).prepareStatement(query);
                preparedStatement.setString(1, Emailr);
                ResultSet resultSet = preparedStatement.executeQuery();

              usuario = new Usuario();
                while(resultSet.next()){
                    usuario.setEmail(resultSet.getString(1));
                    validLogin = true;
                }

                resultSet.close();
                preparedStatement.close();
                return validLogin;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

        }
            //ira salvar os dados
            @Override
            protected void onPostExecute(Boolean sucess) {

                if (sucess) {
                    Intent it = new Intent(Email.this, code.class);
                    it.putExtra("email", usuario.getEmail());
                    startActivity(it);
                    finish();

                } else {
                    Toast.makeText(Email.this, "por favor coloque os seus dados de forma correta", Toast.LENGTH_SHORT).show();
                }

            }
        }

    }
