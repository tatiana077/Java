package ExercicioTres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
     Scanner leitorScanner = new Scanner(System.in);
     
       float media;
     
        System.out.println(" |COMSUMO MEDIO DO AUTOMOVEL| ");
        System.out.println("Imforme a distancia total percorrida: ");
        float distancia = leitorScanner.nextFloat();
         System.out.println("Imforme o total de combustivel gasto: ");
        float combustivel = leitorScanner.nextFloat();
        
         media = distancia/combustivel;
        
        System.out.println("O consumo medio do automovel e " + media + " Km por"
                + " litro");
        
        
        
        
    }
    
}
