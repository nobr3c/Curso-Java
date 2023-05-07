package controle.estruturaControleExercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
//		2. Criar um programa informa se o ano atual é um ano bissexto;

			Scanner scanner = new Scanner(System.in);

			System.out.printf("Digite o ano: ");
			int ano = scanner.nextInt();

			boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

			if (bissexto == true) {
				System.out.println(ano + " é um ano bissexto");
			} else {
				System.out.println(ano + " não é um ano bissexto");
			}
			scanner.close();
		
		/*
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite Ano Atual: ");
		int ano = scanner.nextInt();
		if((ano % 4) == 0) {
			System.out.println("O ano de " + ano + " é bissexto");
		}else {
			System.out.println("O ano de " + ano + " é não bissexto");
		}
		scanner.close();
		Versao Jose Verificar */
	}
}
