package controle;

import java.util.Scanner;

public class WhileIdeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("Sair")) {
			System.out.print("Você diz: ");		
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
