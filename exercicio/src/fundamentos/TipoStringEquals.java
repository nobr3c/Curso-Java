package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s); //Nesse caso será false, embora o conteúdo seja identico
		System.out.println("2".equals(s)); //nesse caso ira apresentar o resultado verdadeiro por que o equals compara o conteudo da String
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); // neste caso o nextLine() => não remove os espaço em branco, poderia utilizar o next() ou o trim()
		System.out.println(s2); //mantém com os espaçamento
		System.out.println("2" == s2.trim()); //trim() ira remover os espaço em branco caso venha a ser digitado
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
