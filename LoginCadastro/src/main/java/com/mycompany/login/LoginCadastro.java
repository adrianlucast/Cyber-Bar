/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.login;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @Analista: Gabriella
 * @Desenvolvedor: Lucas Pessoli
 */
public class LoginCadastro {

    private String user;
    private String email;
    private String senha;
    private int idCadastro;
    ArrayList<Conta> contas;

    public LoginCadastro() {
        contas = new ArrayList<Conta>();
    }

    public void Registrar() {
    }

    public void Login() {
    }

    public void vizualizarContas() {
    }

    private class Conta {

        private String user;
        private String email;
        private String senha;

        public Conta(String user, String email, String senha) {
            this.user = user;
            this.email = email;
            this.senha = senha;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String User) {
            this.user = user;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
    }
}
