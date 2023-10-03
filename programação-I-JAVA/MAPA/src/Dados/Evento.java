package Dados;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Evento {
    //variaveis
    private String nome, data;
    private int valorUnico, capacidadeMaxima, ingressoVendido;
    private List<ingresso> ing;
    int i = 0;
    
    //construtor 1
    public Evento(){       
        this.ing = new ArrayList<ingresso>();
    }
    
    //construtor principal
    public Evento(String nome, String data, int valor, int maximo){
              
        this.ing = new ArrayList<ingresso>();
        setIngressoVendido(ing.size());
        setNome(nome);
        setData(data);
        setValorUnico(valor);
        setCapacidadeMaxima(maximo);
    }
    
    //lista de ingressos    
    public List<ingresso> getIng(){
        return ing;
    }
    public void setIng(List<ingresso> ing){
        this.ing = ing;
    } 
    
    //metodo vender ingresso
    public void venderIngresso(ingresso Ing) throws IOException, AWTException{
        
        i+=1;
        if(i > capacidadeMaxima){
            System.out.println("\nCapacidade máxima exedida, ingresso de " + Ing.getNome() + " não vendido");
            clean();
        } else{
            ing.add(Ing);                                         
        }
        
    }
    
    
    //gets e sets
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getData(){return data;}
    public void setData(String data){this.data = data;}
    public int getValorUnico(){return valorUnico;}
    public void setValorUnico(int valorUnico){this.valorUnico = valorUnico;}
    public int getCapacidadeMaxima(){return capacidadeMaxima;}
    public void setCapacidadeMaxima(int capacidadeMaxima){this.capacidadeMaxima = capacidadeMaxima;}
    public int getIngressoVendido(){return ingressoVendido;}
    public void setIngressoVendido(int ingressoVendido){this.ingressoVendido = ingressoVendido;}
    
    //método de mostrar o evento
    public void MostrarEvento() throws IOException, AWTException{        
        System.out.println("--Evento:"+getNome()+"---");
        System.out.println("Data do evento: "+getData());
        System.out.println("Valor pista do evento: R$"+getValorUnico());
        System.out.println("Maximo de pessoas:"+getCapacidadeMaxima());
        System.out.println("Quantia vendida: "+ing.size()); 
        clean();        
    }
    
    //metodo de mostrar a lista de ingressos
    public void mostrarIngrssos() throws IOException, AWTException{        
        System.out.println("\n---Lista de ingressos que forão vendidos--");
        for(int i = 0; i < ing.size();i++){
            int n = i+1;
            System.out.println("Ingresso "+n);
            String ingressos = "\nNome:"+ ing.get(i).getNome() + "\n" + "CPF:" + ing.get(i).getCPF() + "\n"+"Valor Pago:R$" + ing.get(i).getValor() + "\nTipo do imgrsso:"+ ing.get(i).getTipo();
            System.out.println(ingressos + "\n\n");           
        }
        clean();
    }
    
    //Método para limpar console
    static void clean() throws IOException, AWTException{ 
        System.out.println("\nPrecione enter para continuar");
        System.in.read();
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex){}
    }
}
