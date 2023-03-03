package fundamentos.atividadesPraticas;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		System.out.println("Exercícios: Conceitos Básicos");
		System.out.println("3 - Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.");
		
		Scanner entrada  = new Scanner(System.in);

		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc =  peso / ( altura * altura );
		
		System.out.println("O seu IMC: " + imc);
		
		entrada.close();
	}
}
