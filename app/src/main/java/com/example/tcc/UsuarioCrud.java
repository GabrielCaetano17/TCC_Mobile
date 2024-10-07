package com.example.tcc;

import android.content.Context;

import java.sql.PreparedStatement;

public class UsuarioCrud {

    public static int InserirUsuario (Usuario usuario, Context ctx) {

        int resposta = 0;

        try {
            PreparedStatement pst = Conexao.conectar(ctx).prepareStatement
                    ("Insert Into (nome, email, senha)" + "values (?, ?, ?, 'CLIENTE', NULL, getdate(), 'ATIVO'");

            pst.setString(1, Usuario.getNome());
            pst.setString(2, Usuario.getEmail());
            pst.setString(3, Usuario.getSenha());


            resposta = pst.executeUpdate();
        }
        catch (Exception e) {
            e.getMessage();
        }
return resposta;
    }

}
