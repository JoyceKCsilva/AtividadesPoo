package projeto;

import java.util.Scanner;

public class Basal {

    public static void main(String [] args) {

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
}
