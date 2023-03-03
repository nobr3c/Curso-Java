package fundamentos.atividadesPraticas;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		
		System.out.println("Exercícios: Conceitos Básicos");
		System.out.println("4 - Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.");
		
		Scanner entrada  = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double v1 = entrada.nextDouble();
		
		double quadrado = v1 * v1;
		System.out.println(quadrado);
		
		double cubo = v1 * v1 * v1;
		System.out.println(cubo);
		
		/** Existe tamb�m a seguinte possibilidade
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		*/
		entrada.close();
	}
}
