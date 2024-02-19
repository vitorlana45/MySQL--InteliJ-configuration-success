package org.example;

import DAO.UsuarioDAO;
import entity.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario u = new Usuario();

        u.setNome("Gabriel");
        u.setLogin("Gabriel");
        u.setSenha("root");
        u.setEmail("Gabriel@gmail.com");

        new UsuarioDAO().cadastrarUsuario(u);

    }
}