
package Dados;

public class ingressoVip extends ingresso {
    
    //primeiro construtor
    public ingressoVip(){}
    
    //construtor principal
    public ingressoVip(int valor, String nome, String cpf, String evento,String data){
        setTipo("Vip");
        setValor(valor);
        super.setNome(nome);
        super.setCPF(cpf);
        super.setEvento(evento);
        this.setDataEvento(data);
    }

    //reescrita do metodo
    @Override
    public void setValor(double valor) {
        valor = valor +(valor*0.3);
        super.setValor(valor);
    }  
    
}
