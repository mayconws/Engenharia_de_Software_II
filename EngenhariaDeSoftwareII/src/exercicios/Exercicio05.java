package exercicios;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		String nome = "maycon";
		String nomeInvertido = "";	
		
		for (int i = nome.length() - 1; i >= 0; i--) {
			nomeInvertido += nome.charAt(i);
			
		}
		
		if (nome.equals(nomeInvertido)) {
			System.out.println("palindromo");
			
		}
		
		System.out.println(nomeInvertido);
	}

}
