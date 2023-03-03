package fundamentos.atividadesPraticas;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		System.out.println("Exercícios: Conceitos Básicos");
		System.out.println("2 - Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.\n");
		
		Scanner entrada  = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em Celsius: ");	
		double celsius = entrada.nextDouble();
		
		double conversao =  ( celsius - 32 ) / 1.8;
		
		System.out.println("O valor em Fahrenheit: " + conversao);
		
		entrada.close();
	}
}
