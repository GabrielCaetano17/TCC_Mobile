package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class code extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);


        String email = getIntent().getStringExtra("email");

        Button bnt = (Button) findViewById(R.id.entrar);

        bnt.setOnClickListener(new View.OnClickListener() {
            //irá verificar se os campos estão vazio
            public String validar(){
                String erros="";

                EditText email = (EditText) findViewById(R.id.email);


                if (email.getText().toString().equals("")){
                    erros = erros+"Você deve inserir o código\n";
                    email.setError("Este campo é obrigatório");
                }

                return erros;
            }
            //ira salvar os dados
            @Override
            public void onClick(View view) {
                String erros = validar();
                if (erros.equals("")) {
                    Intent it = new Intent(code.this, Senha.class);
                    it.putExtra("email", email);
                    startActivity(it);
                }else {
                    Toast.makeText(code.this, "Verifique os erros: "+erros, Toast.LENGTH_SHORT).show();//Detectado erros
                }


            }
} );
    }
}