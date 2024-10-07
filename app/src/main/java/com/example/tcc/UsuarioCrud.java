package com.example.tcc;

import android.content.Context;

import java.sql.PreparedStatement;

public class UsuarioCrud {

    public static int InserirUsuario (Usuario usuario, Context ctx) {

        int resposta = 0;

        try {
            PreparedStatement pst = Conexao.conectar(ctx).prepareStatement
                    ("Insert Into (nome, email, senha)" + "values (?, ?, ?, 'CLIENTE', NULL, getdate(), 'ATIVO'")
        }

    }

}
