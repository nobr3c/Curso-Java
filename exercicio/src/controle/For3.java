package controle;

public class For3 {

	public static void main(String[] args) {
		
		int i = 0;
		for(; i < 10; i ++) {
			System.out.println(i);
		}
		
		System.out.println("Saiu do for ...");
		System.out.println(i); //a variavel foi definida fora do laço, sendo assim é possivel acessar ela fora do bloco 
								// A variavel i tem escopo, 
		
		for(int a = 0; a < 10; a ++) {
			System.out.println(a);
		}
		
		int a = 0;
		System.out.println("Saiu do for ...");
		System.out.println(a);
		
		//Escopo onde a variavel esta disponivel, ou seja a variavel pode estar disponivel dentro de um metodo ou na função inteira
		//Não pode usar a variavél antes de declarar ela, dentro de um metodo o algoritimo é executado de forma sequencial, sempre de cima para baixo
		
		// Laço dentro do Outro 
		
		for(int x = 0; x < 10; x ++) {
			for(int y = 0; y < 10; y ++) {
				System.out.printf("[%d %d]", x, y);
			}
			System.out.println();
		}
	}
}
