package tratandoExececoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio02 {
	
	public static void main (String[] ars) {
		
		String teste = "";
		
		if (teste == null || teste.length() == 0) {
			throw new IllegalArgumentException();
		}
		
		try {
				
		FileReader fr = new FileReader("C:\\Users\\Aluno\\teste.txt");
		BufferedReader br = new BufferedReader(fr);
		String linha = "";
		while (linha != null) {
			linha = br.readLine();
			if (linha != null)
				System.out.println(linha);
		}
		
		
	} catch (IOException e) {
		System.out.println("Erro ao abrir o arquivo." + e.getMessage());
		}
	}

}
