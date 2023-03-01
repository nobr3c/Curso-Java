package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String ("texto");
		s.toUpperCase();
		
		//Wappers = aquilo que envolve, uma classe que acaba envolvendo o tipo primitivo 
		//Wappers são a versão objeto dos tipos primitivos
		//Tudo em java é objeto menos os 8 tipos primitivos, tudo em java é baseado em classe com exceção dos tipos primitivos 
		int a = 123;
		System.out.println(a);
	}
}
