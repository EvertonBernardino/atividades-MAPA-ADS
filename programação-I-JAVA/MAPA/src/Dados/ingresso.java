
package Dados;


public class ingresso {
    
    //variaveis
    private String nome,CPF;
    protected double valor;
    private String tipo;
    private String evento;
    private String dataEvento;
    
    //construtor 1
    public ingresso(){}
    
    //construtor principal
    public ingresso(double valor, String nome, String cpf, String evento,String data){
        setTipo("Pista");
        this.setValor(valor);
        this.setNome(nome);
        this.setCPF(cpf);
        this.setEvento(evento);
        this.setDataEvento(data);
    }

    
    //gets e sets
    public String getNome(){return nome;}    
    public void setNome(String nome){this.nome = nome;}
    public String getCPF(){return CPF;}    
    public void setCPF(String CPF){this.CPF = CPF;}    
    public double getValor(){return valor;}    
    public void setValor(double valor){this.valor = valor;}    
    public String getTipo(){return tipo;}    
    public String getEvento(){return evento;}    
    public void setEvento(String evento){this.evento = evento;}
    public void setTipo(String tipo){this.tipo = tipo;}
    public String getDataEvento(){return dataEvento;}
    public void setDataEvento(String dataEvento){this.dataEvento = dataEvento;}
    
    
    
    //metodo para mostrar o ingresso cadastrado
    public void mostrarIngrsso(){
        System.out.println("\n\nIngresso cadastrado com sucesso");
        System.out.println("Nome do evento:"+getEvento());
        System.out.println("Data do evento:"+getDataEvento());
        System.out.println("Nome:"+getNome());
        System.out.println("CPF:"+getCPF());
        System.out.println("Tipo de ingresso: "+getTipo());
        System.out.println("Valor a ser cobrado: "+this.getValor());
    }      
    
}



