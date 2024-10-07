package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FormLogin extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        //botão para salvar os dados
        Button btnSalvar = (Button) findViewById(R.id.entrar);
        TextView textView1 = findViewById(R.id.tstCadastro);
        TextView textView2 = findViewById(R.id.esqueceu);



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
        //irá verificar se os campos estão vazio
        public String validar(){
            String erros="";

            EditText email = (EditText) findViewById(R.id.email);
            EditText senha = (EditText) findViewById(R.id.senha);


            if (email.getText().toString().equals("")){
                erros = erros+"Campo email é obrigatório\n";
                email.setError("Este campo é obrigatório");
            }

            if (senha.getText().toString().equals("")){
                erros = erros+"Campo senha é obrigatório\n";
                senha.setError("Este campo é obrigatório");
            }



            if (!email.getText().toString().contains("@")) {
                //verifica se tem @ no campo do email, e nega a condição no comeco, se não tiver @ não é valido
                erros = erros + "coloque um email valido\n";
                email.setError("Email inválido");//adciona erro no componente;
            }
            return erros;
        }
        //ira salvar os dados
        @Override
        public void onClick(View view) {
            String erros = validar();
            if (erros.equals("")) {
                //Codigo de salvar es dados...
                Toast.makeText(FormLogin.this, "Bem Vindo", Toast.LENGTH_SHORT).show();//serve para cliar a mensagem que aparece rapidamente
                finish();
                Intent it = new Intent(FormLogin.this, InicialCc.class);
                startActivity(it);
            }else {
                Toast.makeText(FormLogin.this, "Verifique os erros: "+erros, Toast.LENGTH_SHORT).show();//Detectado erros
            }





        }




    });
}


}

