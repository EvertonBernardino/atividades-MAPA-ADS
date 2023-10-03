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
public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private Double valorPorKM;
    
    public void cadastarCarro(){
        this.modelo = JOptionPane.showInputDialog("Cadastrar Modelo:");
        this.marca = JOptionPane.showInputDialog("Cadastrar Marca:");        
        this.valorPorKM = Double.valueOf(JOptionPane.showInputDialog("Cadastrar Valor por KM:"));
}
    public String mostrarDadosCarro(){
         return "Model: " + modelo + "\n"+ "Marca: " + marca + "\n Valor por KM: " + valorPorKM;
    }

    public Double getValorPorKM() {
        return valorPorKM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
       
}
