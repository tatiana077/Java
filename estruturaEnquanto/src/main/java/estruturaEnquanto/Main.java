package estruturaEnquanto;

 import java.util.Scanner;

 public class Main {

  public static void main(String[] args) {
 
    int totalAlunos = 10;
    
      Scanner leitorScanner = new Scanner (System.in);    
        
        while (totalAlunos > 0){
        
        System.out.println("Digite o nome do aluno: ");
        
           String nomeAluno = leitorScanner.nextLine();
           
        System.out.println("Digite a idade: ");   
        
          int idadeAluno = leitorScanner.nextInt();
        
            System.out.println("O nome do aluno e: " + nomeAluno + ",e a sua"
                    + " idade e: " + idadeAluno);
            
            
            totalAlunos = totalAlunos - 1;
        
    }
    
}

}