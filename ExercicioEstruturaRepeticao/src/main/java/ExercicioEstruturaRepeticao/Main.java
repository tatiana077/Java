package ExercicioEstruturaRepeticao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    Scanner leitorScanner = new Scanner(System.in);
    
    char desejaContinuar = 'S';
     
    while(desejaContinuar == 'S' || desejaContinuar == 's'){    
        
        System.out.println("Digite um numero: ");
        int numero = leitorScanner.nextInt();
        
        if(numero == 0) {
            System.out.println("O numero e zero.");
        }
        else{
            if(numero > 0){
                System.out.println("Numero maior que zero.");
            }
            else{
                System.out.println("Numero menor que zero.");
            }
        }
        
        System.out.println("Deseja continuar? S-Sim/N-Nao.");
        desejaContinuar = leitorScanner.next().charAt(0);
        
        
 
        
   }
    
}
}