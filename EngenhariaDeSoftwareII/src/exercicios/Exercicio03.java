package exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio03 {
	
public static final List<Character> VOGAIS = Arrays.asList('a','e','i','o','u');
    
    public static String filtraVogais (String nome) {
        String letrasVogais = "";
        
        
        for (char c : nome.toCharArray()) {
            if (VOGAIS.contains(Character.toLowerCase(c))) {
                letrasVogais += c;
            }
        }
        
        return letrasVogais;
    }

    public static void main(String[] args) {

        String vogais = filtraVogais("Maycon");
        System.out.println(vogais);
        
    }


}
