package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		//if(booleana), while(booleana) e for(; booleana; ) = expressao booleana, recebe verdadeiro ou falso
		//switch sem o break irá executar todos os cases, 
		String faixa = "preta";
		switch (faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break; 
		default:
			System.out.println("Não sei de nada");
		}
		System.out.println("Fim");
		
		//Exemplo com inteiro
		
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");		
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");		
		}
	}
}
