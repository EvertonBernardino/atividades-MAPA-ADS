package atvmapaprog1;

import Dados.ingresso;
import Dados.Evento;
import Dados.ingressoCamarote;
import Dados.ingressoVip;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AtvMapaProg1 {

    public static void main(String[] args) throws IOException, AWTException {
      //criando o evento
      Evento event = new Evento("TypHits", "20/10/22", 150, 3);
      event.MostrarEvento();
      
      //criando o primeiro ingresso  
      ingresso ing = new ingresso(event.getValorUnico(),"Fulano", "999.999.777-55",event.getNome(), "20/10/22");
      ing.mostrarIngrsso();
      
      //criando o segundo ingresso  
      ingressoCamarote ing2 = new ingressoCamarote(event.getValorUnico(),"Ciclano", "555.888.222-21",event.getNome(), event.getData());
      ing2.mostrarIngrsso();
        
      //criando o terceiro ingresso
      ingressoVip ing3 = new ingressoVip(event.getValorUnico(),"Beutrano", "777.222.555-44",event.getNome(),event.getData());
      ing3.mostrarIngrsso();
        
      //criando o quarto ingresso
      ingresso ing4 = new ingresso(event.getValorUnico(),"covidisson", "111.222.335-72",event.getNome(),event.getData());
      ing4.mostrarIngrsso();
      

      //vendendo os ingressos criados
      event.venderIngresso(ing);
      event.venderIngresso(ing2);
      event.venderIngresso(ing3);
      event.venderIngresso(ing4);
      
      //mostrando o evento criado e ingressos vendidos
      event.MostrarEvento();
      
      //mostrando a lista de ingressos vendidos
      event.mostrarIngrssos();
      
    }
    
}

