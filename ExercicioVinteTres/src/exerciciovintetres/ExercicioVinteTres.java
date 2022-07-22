package exerciciovintetres;

import java.util.Scanner;

public class ExercicioVinteTres {

    public static void main(String[] args) {
     Scanner leitorScanner = new Scanner(System.in);
     
        System.out.println("Digite um número: ");
        int numero = leitorScanner.nextInt();
        
        if(numero > 80){
            System.out.println("Este numero e maior que 80!");
        }
        else{
            if(numero < 25){
                System.out.println("Este numero e menor que 25!");
                
            }
            else{
                if(numero == 40){
                    System.out.println("Este numero e igual a 40!");
                    
                }
                else{
                    System.out.println("Numero normal.");
                }
            }
        }
        
        
        
    }
    
}
