
package Dados;

public class ingressoCamarote extends ingresso {
    
    
    //construtor 1
    public ingressoCamarote(){}   
    
    //construtor principal
    public ingressoCamarote(int valor, String nome, String cpf, String evento,String data){
        setTipo("Camarote");
        setValor(valor);
        super.setNome(nome);
        super.setCPF(cpf);
        super.setEvento(evento);
        this.setDataEvento(data);
    }
    
    //reescrita do metodo
    @Override
    public void setValor(double valor) {
        valor = valor +(valor*0.6);
        super.setValor(valor);
    }
    
}
