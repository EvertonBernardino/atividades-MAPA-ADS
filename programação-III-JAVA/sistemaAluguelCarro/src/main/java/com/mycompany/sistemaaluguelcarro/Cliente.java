/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaaluguelcarro;

import javax.swing.JOptionPane;

/**
 *
 * @author Everton
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    
    public void cadastrarUsuario(){
        this.nome = JOptionPane.showInputDialog("Cadastrar nome:");
        this.cpf = JOptionPane.showInputDialog("Cadastrar CPF:");
        this.telefone = JOptionPane.showInputDialog("Cadastrar Telefone:");
    }
    public String mostrarDadosUsuario(){
        return "Nome: " + nome + "\n CPF: " + cpf + "\n Telefone: " + telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

