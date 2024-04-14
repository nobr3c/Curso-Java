package fundamentos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		System.out.println("Exercícios: Conceitos Básicos");
		System.out.println("5 - Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.\n");
		
		Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Digite a Base do triangulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite a Altura do triangulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A Área do Triângulo é: " + area);
		
		entrada.close();
	}
}
