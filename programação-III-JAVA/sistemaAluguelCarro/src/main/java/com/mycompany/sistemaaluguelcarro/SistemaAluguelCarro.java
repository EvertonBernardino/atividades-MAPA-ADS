/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaaluguelcarro;

/**
 *
 * @author Everton
 */
public class SistemaAluguelCarro {
    
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        aluguel.iniciarLocação();
        aluguel.fecharLocação();
        aluguel.mostrarResumoLocação();
    }
}
