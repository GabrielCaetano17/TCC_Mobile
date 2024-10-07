package com.example.tcc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormCadastro extends AppCompatActivity {

    public boolean valido = true;

  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);
        //botão para salvar os dados
        Button btnSalvar = (Button) findViewById(R.id.entrar);
        TextView textView1 = findViewById(R.id.tstCadastro);

      textView1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent it = new Intent(FormCadastro.this, FormLogin.class);
              startActivity(it);
          }
      });


        btnSalvar.setOnClickListener(new View.OnClickListener() {

            //irá verificar se os campos estão vazio
            public String validar(){
                String erros="";

                EditText nome = (EditText) findViewById(R.id.nome);
                EditText email = (EditText) findViewById(R.id.email);
                EditText Senha = (EditText) findViewById(R.id.senha);
                EditText repetir = (EditText) findViewById(R.id.repetir);

                if (nome.getText().toString().equals("")){
                    erros = "O nome é obrigatório\n";
                    nome.setError("Este campo é obrigatório");
                }
                if (email.getText().toString().equals("")){
                    erros = erros+"O email é obrigatório\n";
                    email.setError("Este campo é obrigatório");
                }
                if (Senha.getText().toString().equals("")){
                    erros = erros+"" +
                            "A Senha é obrigatório\n";
                    Senha.setError("Este campo é obrigatório");
                }

                if (repetir.getText().toString().equals("")){
                    erros = erros+"repetir a Senha é obrigatório\n";
                    Senha.setError("Este campo é obrigatório");
                }
                if (!email.getText().toString().contains("@")) {
                    //verifica se tem @ no campo do email, e nega a condição no comeco, se não tiver @ não é valido
                    erros = erros + "coloque um email valido\n";
                    email.setError("Email inválido");//adciona erro no componente;
                }

                String senhaRecebida = Senha.getText().toString();
                String repetirRecebido = repetir.getText().toString();

                if (!senhaRecebida.equals(repetirRecebido)){
                    erros = erros+"repita a mesma senha\n";
                    repetir.setError("coloque a senha novamente");
                }


                return erros;
            }
            //ira salvar os dadosbreno@
            @Override
            public void onClick(View view) {
                String erros = validar();
                if (erros.equals("")) {
                    //Codigo de salvar es dados...
                    Toast.makeText(FormCadastro.this, "Cadastro realizado", Toast.LENGTH_SHORT).show();//serve para clicar a mensagem que aparece rapidamente
                    finish();
                    Intent it = new Intent(FormCadastro.this, InicialCc.class);
                    startActivity(it);
                }else {
                    Toast.makeText(FormCadastro.this, "Verifique os erros: "+erros, Toast.LENGTH_SHORT).show();//Detectado erros

                    erros = "";
                }



            }
        });
    }


}



