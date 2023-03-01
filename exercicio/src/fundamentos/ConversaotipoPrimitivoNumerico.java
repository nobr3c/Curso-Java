package fundamentos;

public class ConversaotipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //conversão implicita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // Conversão explicita(CAST), poderia ser float b = 1.0F -- Valor sera truncado por que o float não suporta este tipo de valor e eventualmente ira perder informação
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; //explicita (CAST)
		System.out.println(f);
		
	}
}
