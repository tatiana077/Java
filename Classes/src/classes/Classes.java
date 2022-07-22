package classes;

import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {
      
        Pessoa objetoPessoa = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite seu peso: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite sua altura: ");
        objetoPessoa.setAltura(leitor.nextFloat());
        System.out.println("                                     ");
        System.out.println("Seu IMC: " +objetoPessoa.calcularIMC());
        System.out.println("_____________________________________");
    }
    
}
