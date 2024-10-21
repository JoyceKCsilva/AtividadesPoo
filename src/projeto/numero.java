package projeto;

import java.util.Scanner;

public class numero {
	
	public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int num = entrada.nextInt();
        
        if (num % 2 == 1) {
        	System.out.println("O número é impar!");
        } else {
        	System.out.println("O número é par!");
        }
        
	}
}
