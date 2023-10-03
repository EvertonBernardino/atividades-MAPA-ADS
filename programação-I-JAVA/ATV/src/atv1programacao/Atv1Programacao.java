package atv1programacao;

//Bibliotecas
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

//classe principal
public class Atv1Programacao {
    
    //metodo principal
    public static void main(String[] args) throws IOException, InterruptedException {
        
        int op;
        
        Scanner scan = new Scanner(System.in);
        
        menu();
        System.out.print("-> ");
        op = scan.nextInt();
        
        //escolha das opções
        while(op!=0){
            switch(op){
                case 1 -> soma();
                case 2 -> subitracao();
                case 3 -> divisao();
                case 4 -> multiplicacao();
                case 5 -> elevadoA2();
                default -> System.out.println("Escolha uma opção valida!");                  
            }
            
            menu();
            System.out.print("-> ");
            op = scan.nextInt();
        }
    }
    
    //método de soma
    static void soma() throws IOException{
        
        clean2();
                
        Scanner scan = new Scanner(System.in);
        
        //variaveis do método
        double resultado;
        double n1;
        double n2;
  
        System.out.println("---soma---");
        System.out.println();
                
        //inserção dos números
        System.out.println("Insira o primeiro número");
        System.out.print("-> ");
        n1 = scan.nextDouble();
        System.out.println("Insira o segundo número");
        System.out.print("-> ");
        n2 = scan.nextDouble();
        
        //soma dos resultados
        resultado = n1 + n2;
        
        //impressão do numero
        System.out.println(n1 + "+" + n2 + " = " + resultado);
        clean();
            
    }
    
    
    //método de subitração
    static void subitracao() throws IOException{
        
        clean2();
        
        Scanner scan = new Scanner(System.in);
        
         //variaveis do método
        double resultado;
        double n1;
        double n2;       
       
        System.out.println("---Subitração---");
        System.out.println();
        
        //inserção dos números
        System.out.println("Insira o primeiro número");
        System.out.print("-> ");
        n1 = scan.nextDouble();
        System.out.println("Insira o segundo número");
        System.out.print("-> ");
        n2 = scan.nextDouble();
        
        //subtração do número
        resultado = n1 - n2;
        
        //impressão do resultado
        System.out.println(n1 + "-" + n2 + " = " + resultado);
        clean();
          
    }
    
    //método de divisão
    static void divisao() throws IOException{
        clean2();
        
        Scanner scan = new Scanner(System.in);
        
        //variaveis do método
        double resultado;
        double n1;
        double n2;
        
        System.out.println("---divisão---");
        System.out.println();
        
        //inserção dos números
        System.out.println("Insira o primeiro número");
        System.out.print("-> ");
        n1 = scan.nextDouble();
        System.out.println("Insira o segundo número");
        System.out.print("-> ");
        n2 = scan.nextDouble();
        
        //Divisão do número
        resultado = n1 / n2;
        
        //impressão do resultado
        System.out.println(n1 + "/" + n2 + " = " + resultado); 
        clean();
    }
    
    //método de multiplicação
    static void multiplicacao() throws IOException{
        clean2();
        
        Scanner scan = new Scanner(System.in);
        
        //variaveis do método
        double resultado;
        double n1;
        double n2;

        System.out.println("---Multiplicação---");
        System.out.println();
        
        //inserção dos números
        System.out.println("Insira o primeiro número");
        System.out.print("-> ");
        n1 = scan.nextDouble();
        System.out.println("Insira o segundo número");
        System.out.print("-> ");
        n2 = scan.nextDouble();
        
        //multiplicando dois numeros
        resultado = n1 * n2;
        
        //impressão do resultado
        System.out.println(n1 + "/" + n2 + " = " + resultado); 
        clean();
    }
    
    //método de um número elevado a 2
    static void elevadoA2() throws IOException{
        
        clean2();
        
        Scanner scan = new Scanner(System.in);
        
        //variaveis do método
        long resultado;
        long n1;                     
        
        System.out.println("--Elevado ao quadrado--");
        System.out.println();
        
        //inserção de um número
        System.out.println("Insira um número");
        System.out.print("-> ");
        n1 = scan.nextLong();
        
        //metodo para elevar um numero por 2
        resultado = (long) Math.pow(n1, 2);
        
        //impressão do resultado
        System.out.println(n1 + "²" + " = " + resultado);
        
        clean();
    }
    
    //metodo de menu
    static void menu(){
        
        System.out.println(" ---------------------------------");
        System.out.println("| Qual operação vc deseja fazer ? |");
        System.out.println("|1 - Soma                         |");
        System.out.println("|2 - Subritração                  |");
        System.out.println("|3 - DivisÃ£o                     |");
        System.out.println("|4 - Multiplicação                |");
        System.out.println("|5 - Quadrado de um numero        |");
        System.out.println("|0 - Encerrar o programa          |");
        System.out.println(" ---------------------------------");
    }
    
    //Método para limpar console com pause
    static void clean() throws IOException{
        
        System.out.println("Precione enter para continuar");
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
    
    //Método para limpar console
    static void clean2() throws IOException{         
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