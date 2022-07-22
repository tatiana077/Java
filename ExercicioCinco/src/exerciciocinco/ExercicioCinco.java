package exerciciocinco;

import java.util.Scanner;

public class ExercicioCinco {

   
    public static void main(String[] args) {
       
      Scanner leitorScanner = new Scanner(System.in); 
      float media;
      float soma; 
      
        System.out.println("Imforme o nome do aluno: "); 
        String nome = leitorScanner.nextLine();
        
        System.out.println("Imforme nota 1: ");
        float notaUm = leitorScanner.nextFloat();
         System.out.println("Imforme nota 2: ");
        float notaDois = leitorScanner.nextFloat();
         System.out.println("Imforme nota 3: ");
        float notaTres = leitorScanner.nextFloat();
        
        
         soma = notaUm + notaDois + notaTres;
         media = soma / 3;
               
        System.out.println("O nome do aluno e " + nome +  " e sua media e "
                + media);
        
        
         if(media >= 70){
             System.out.println("Aprovado!");
         }
         else{
             System.out.println("Reprovado!");
         }
      
        
     
        
    }
    
}
