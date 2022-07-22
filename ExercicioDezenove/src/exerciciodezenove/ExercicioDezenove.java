package exerciciodezenove;
 import java.util.Scanner;
/**
 *
 * @author Tatiana Vargas
 */
public class ExercicioDezenove {

    public static void main(String[] args) {
      
        String nome;
        String sexo;
      
       Scanner leitor = new Scanner(System.in);
        int i = 0;
    for(; i <= 10; i = i + 1) {
        System.out.println("Imforme seu nome: ");  
        nome = leitor.nextLine();
        System.out.println("Imforme seu sexo: Masculino ou Feminino ");  
        sexo = leitor.nextLine();
        
        if(sexo == "Masculino" || sexo == "masculino"){
        
          System.out.println("Voce e homem.");
        }  
        else{
        
        System.out.println("Voce e mulher");      
   
        }  
        
        System.out.println("Seu nome e: " + nome);
       
    }  
    
        System.out.println("O total de homens e mulheres e: " +i);
}
}
