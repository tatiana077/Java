package ExercicioUm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 
      Scanner leitorScanner = new Scanner(System.in);
      
      int soma;
      int divisao;
      int subtracao;
      int multiplicacao;
 
        System.out.println("Digite um numero: ");
        int numeroUm = leitorScanner.nextInt();
        
        System.out.println("Digite outro numero: ");
        int numeroDois = leitorScanner.nextInt();
        
         soma = numeroUm + numeroDois;
         divisao = numeroUm / numeroDois;
         subtracao = numeroUm - numeroDois;
         multiplicacao = numeroUm * numeroDois;
         
        System.out.println("Soma: " +soma);
        System.out.println("Divisão: " +divisao);
        System.out.println("Subtração: " +subtracao);
        System.out.println("Multiplicação: " +multiplicacao);
        
        
        
        
        
        
        
        
    }
    
}
