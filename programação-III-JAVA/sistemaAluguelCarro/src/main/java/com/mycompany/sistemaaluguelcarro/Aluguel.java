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
public class Aluguel {
    private int id;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private Double valorTotalAluguel;
    private Cliente cliente = new Cliente();
    private Carro carro = new Carro();
    
    public void iniciarLocação(){
        cliente.cadastrarUsuario();
        carro.cadastarCarro();
        kmInicial = Integer.parseInt(JOptionPane.showInputDialog("KM Inicial do veiculo:"));               
    }
    
    public void fecharLocação(){
        kmFinal = Integer.parseInt(JOptionPane.showInputDialog("KM Final do veiculo:"));
        
        qtdDias = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dias:"));
        
         valorTotalAluguel = ((kmFinal-kmInicial)* carro.getValorPorKM())+ (qtdDias * carro.getValorPorKM());
        
        if (valorTotalAluguel >= 10 && valorTotalAluguel < 20){
            valorTotalAluguel = valorTotalAluguel * 0.10;
        }
        if(valorTotalAluguel > 20){
            valorTotalAluguel = valorTotalAluguel * 0.20;
        }
    }
    
    public void mostrarResumoLocação(){
        JOptionPane.showMessageDialog(null, "Cliente:\n" + cliente.mostrarDadosUsuario()+ "\n\nCarro:\n" + carro.mostrarDadosCarro() + "\n\nAluguel:\n" + "Quantidade de dias:"+qtdDias+"\n"+"Km Inicial:"+kmInicial+"\n"+"Km Final:"+kmFinal+"\n"+"Valor Total:R$"+valorTotalAluguel);
    }
}
