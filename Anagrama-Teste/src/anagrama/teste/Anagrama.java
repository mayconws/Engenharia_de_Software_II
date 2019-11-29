package anagrama.teste;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

	public String gera(String palavra) {
		
        String resultado = "";
        List<String> lista = new ArrayList<>();

        
        for (int i = 0; i < palavra.length();i++) {
            
            resultado += String.valueOf(palavra.charAt(i));
            
            for (int j = 0; j < palavra.length();j++) {
            
                if (i != j) {
                    resultado += String.valueOf(palavra.charAt(j));
                }
                
            }
            
            if(!lista.contains(resultado)){
                lista.add(resultado);
            }
            resultado = "";
            
            
            resultado += String.valueOf(palavra.charAt(i));
            
            for (int w = palavra.length()-1; w >= 0;w--) {
                
                if (i != w) {
                    resultado += String.valueOf(palavra.charAt(w)); 
                }

            }
            
            if(!lista.contains(resultado)){
                lista.add(resultado);
            }
            resultado = "";
        }
                
        for (String s : lista) {
            resultado += s + ";";
        }
        
        return resultado;
    }

}
