package tratandoExececoes;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class Exercicio01 {
	
	public static void main (String[] ars) {
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