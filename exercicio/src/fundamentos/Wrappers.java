package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
				//A exceção esta no int que passa a ser Integer e char passa a ser Character
				//Existe para cada uma das versoes dos tipos primitivos uma versão orientada a objetos
				
				//Scanner entrada = new Scanner(System.in);
				
				//byte
				Byte 	b 	= 100;
				Short 	s 	= 1000;
				Integer i 	= 10000; // Tipo primitivo é o int
				//Integer ii	= Integer.parseInt(entrada.next()); // parseInt = Converte uma string para valor numerico
				Long	l	= 100000L; // Correspondente primitivo long com letra minuscula
				
				System.out.println(b.byteValue());
				System.out.println(s.toString());
				System.out.println(i * 3);
				//System.out.println(ii);
				System.out.println(l / 3);

				//entrada.close();
				
				Float f = 123.10F;
				System.out.println(f);
				
				Double d = 1234.5678;
				System.out.println(d);
				
				Boolean bo = Boolean.parseBoolean("true"); // Correspondente primitivo boolean com letra minuscula
				System.out.println(bo);
				System.out.println(bo.toString().toUpperCase()); // Converte para String e depois para maiúsculo
				
				Character c= '#'; //char
				System.out.println(c + "...");	
	}
}
