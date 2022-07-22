
package exercicioQuinze;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
     int numero; 
     Scanner leitorScanner = new Scanner(System.in);
     
      System.out.println("Escreva um numero: ");
        numero = leitorScanner.nextInt();
        
        if (numero >= 100 && numero <= 200) {
            
            System.out.println("O numero esta entre 100 e 200.");
        }
        else    
        
            System.out.println("Este numero não está entre 100 e 200.");
        
        
        
        
    }
    
}
