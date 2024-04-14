package controle.estruturaControleExercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//5. Refatorar o exercício 04, utilizando a estrutura switch.
		
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		String num = "";
		switch(contadorDeDivisores) {
			case 0:
				num = "Primo";
				break;
			default:
				num = "Não é Primo";				
		}
		System.out.println(num);
		
		
		/*Versão Professor
		 int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		scanner.close();
		 */
		scanner.close();
		
	}
}
