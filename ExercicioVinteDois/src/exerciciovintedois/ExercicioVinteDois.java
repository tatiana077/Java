package exerciciovintedois;

import java.util.Scanner;

 public class ExercicioVinteDois {

  public static void main(String[] args) {
    
       String nomeProduto;
       float precoCusto;
       float precoVenda;
       float totalCusto = 0.0f;
       float totalVenda = 0.0f;
       int i = 0;
       Scanner leitorScanner = new Scanner(System.in);
   
      
      for (; i < 3; i++) {
         
       System.out.println("Imforme o nome do produto: ");
       nomeProduto = leitorScanner.next();
   
       System.out.println("Imforme o preco de custo do produto: ");
       precoCusto = leitorScanner.nextFloat();
   
       System.out.println("Imforme o preco de venda do produto: ");
       precoVenda = leitorScanner.nextFloat();    
          
          totalCusto = totalCusto + precoCusto;
          totalVenda = totalVenda +  precoVenda;
       
          if (precoCusto == precoVenda) {
              System.out.println("____________________________________________");
              System.out.println("Houve empate entre os precos.");  
              System.out.println("____________________________________________");
          }
          else{
              if(precoCusto > precoVenda){
                  System.out.println("____________________________________________");
                  System.out.println("Houve Prejuizo!)");
                  System.out.println("____________________________________________");
               }
              else{
                  System.out.println("____________________________________________");
                  System.out.println("Houve lucro!");
                  System.out.println("____________________________________________");
          
               }
           
           }
          System.out.println("--------------------------------------------");
          System.out.println(nomeProduto + ", seu preco de custo e " + precoCusto +
                  ". E seu preco de venda e " +precoVenda );
          System.out.println("--------------------------------------------");
          
       }
          System.out.println("--------------------------------------------");
          System.out.println("A media do preco de custo dos produtos e " + 
                  ( totalCusto / i));
          System.out.println("--------------------------------------------");
          
          
          System.out.println("--------------------------------------------"); 
          System.out.println("A media do preco de vendas dos produtos e " + 
                  ( totalVenda / i));
          System.out.println("--------------------------------------------");
          
  
        
        
        
        
        
        
        
  
  
  }
    
}
