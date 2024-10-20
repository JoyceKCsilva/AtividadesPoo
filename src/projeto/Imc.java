package projeto;

import java.util.Scanner;

public class Imc {
	
	public static void main(String[] args) {
		
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
	
}
