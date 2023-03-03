package fundamentos.atividadesPraticas;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		System.out.println("Exercícios: Conceitos Básicos");
		System.out.println("1 - Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius\n");
		
		Scanner entrada  = new Scanner(System.in);

		System.out.print("Digite uma temperatura em Fahrenheit: ");		
		double fahrenheit = entrada.nextDouble();
		
		double conversao =  fahrenheit * 1.8 + 32;
		
		System.out.println("O valor em Celsius: " + conversao);
		
		entrada.close();
	}
}
