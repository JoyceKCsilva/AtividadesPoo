package projeto;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner label = new Scanner(System.in);
		String escolha = "menu";
		
		do {
			System.out.println("Escolha uma das opções:");
			System.out.println("1 - Calcular IMC");
			System.out.println("2 - Metabolismo Basal");
			System.out.println("3 - Numero");
			System.out.println("0 - Sair");
			
			escolha = label.next();
			
			switch (escolha){
				case "1":
					Imc(label);
					break;
					
				case "2":
					Basal(label);
					break;
				
				case "3":
					Numero(label);
					break;
					
				case "0":
					System.out.println("Fim do programa!");
					
				default:
					System.out.println("Opção inválida! Digite uma das opções do menu!");
			}	
				
					
			} while (!escolha.equals("0"));
		}
	
	
	public static void Imc (Scanner label) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.next();
		
		System.out.println("Olá " +nome +"! Por favor me diga o seu peso:");
		float peso = entrada.nextFloat();
		
		System.out.println("Agora preciso da sua altura:");
		float altura = entrada.nextFloat();
		
		float calculo = ( peso / (altura * altura));
		
		String result = "";
		if(calculo < 19) {
			result = "a baixo do peso";
		} else if (calculo < 25) {
			result = "peso normal";
		} else if (calculo < 30) {
			result = "sobrepeso";
		} else if (calculo < 40) {
			result = "obesidade tipo 1";
		} else {
			result = "obesidade morbida";
		}
		
		System.out.println(nome +" seu resultado é: " +result);
	}
	
	public static void Basal (Scanner label) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite H se você for homem ou M se você for mulher:");
        String sexo = entrada.next();
        while (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m")) {
            System.out.println("Entrada inválida! Digite H se você for homem ou M se você for mulher:");
            sexo = entrada.next();
        }

        System.out.println("Digite sua idade:");
        float idade = entrada.nextFloat();
        while (idade < 18) {
            System.out.println("Idade inválida! O cálculo é válido apenas para pessoas com 18 anos ou mais.");
            System.out.println("Digite sua idade novamente:");
            idade = entrada.nextFloat();
        }

        System.out.println("Agora digite seu peso:");
        float peso = entrada.nextFloat();
        while (peso <= 0) {
            System.out.println("Peso inválido! O peso precisa ser maior que zero.");
            System.out.println("Digite seu peso novamente:");
            peso = entrada.nextFloat();
        }

        float result = 0;
        if (sexo.equalsIgnoreCase("h")) {  
            if (idade < 30) {
                result = (15.057f * peso + 679f);
            } else if (idade < 60) {
                result = (11.6f * peso + 879f);
            } else {
                result = (13.5f * peso + 487f);
            }
        } else if (sexo.equalsIgnoreCase("m")) {
            if (idade < 30) {
                result = (14.7f * peso + 486.6f);
            } else if (idade < 60) {
                result = (8.7f * peso + 829f);
            } else {
                result = (10.5f * peso + 596f);
            }
        }

        System.out.println("O seu metabolismo basal em calorias é igual a: " + result);

        entrada.close(); 
    }
	
	public static void Numero (Scanner label) {
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
