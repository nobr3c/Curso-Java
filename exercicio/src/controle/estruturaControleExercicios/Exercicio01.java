package controle.estruturaControleExercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
	
		//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par; => Futuramente criar um metodo para puxar o valor de outra classe imprimir 
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite um numero: ");		
		int num = entrada.nextInt();
		
		if(num >=0 && num <=10) {
			System.out.println(num + " Esta entre 0 e 10");
			if((num % 2) == 0) {
				System.out.println("Numero Par");
			}else {
				System.out.println("Numero Impar");
			}
		}else {
			System.out.println(num + " Não esta entre 0 e 10");
		}
		
		System.out.println("Version José");
		entrada.close();
		
		/*
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
			} else {
				System.out.println("O numero " + numero + " está entre 0 e 10 mas não é um par.");
			}
		} else {
			System.out.println("O numero " + numero + " não está entre 0 e 10.");
		}
		scanner.close();*/
	}
}
