package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if("segunda".equalsIgnoreCase(dia)
				||"segunda-feira".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}else if("terça".equalsIgnoreCase(dia)
				|| "terca".equalsIgnoreCase(dia)
				|| "terca-feira".equalsIgnoreCase(dia)
				|| "terça-feira".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}else if("quarta".equalsIgnoreCase(dia)
				|| "quarta-feira".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}else if("quinta".equalsIgnoreCase(dia)
				||"quinta-feira".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}else if("sexta".equalsIgnoreCase(dia)
				||"sexta-feira".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}else if("sabado".equalsIgnoreCase(dia)
				||"sábado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}else{
			System.out.println("Dia Inválido");
		}
		
		entrada.close();
	}
}
