package com.example.tcc;

import android.content.Context;

import java.sql.PreparedStatement;

public class UsuarioCrud {

    Usuario usuario;
    public static int InserirUsuario (Usuario usuario, Context ctx) {

        int resposta = 0;

        try {
            PreparedStatement pst = Conexao.conectar(ctx).prepareStatement
                    ("INSERT Usuario (nome, email, senha, nivelAcesso, foto, dataCadastro, statusUsuario)\n" +
                            "VALUES (?, ?,? , 'Cliente', NULL, GETDATE(), 'ATIVO')");

            new Usuario();
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getSenha());


            resposta = pst.executeUpdate();
        }
        catch (Exception e) {
            e.getMessage();
        }
return resposta;
    }

}
