package criandoExcecoes;

import java.util.Arrays;
import java.util.List;

public class MyException {
	
	private static final List<String> badFoods 
	= Arrays.asList("Pizza", "Batata Frita");

	public static void main(String[] args) {
		try {
			checkFood("Pizza");
		} catch (BadFoodException e) {
			System.out.println("O alimento informado "
					+ "é inadequado");
		}

	}
	
	private static void checkFood(String nomeAlimento) 
			throws BadFoodException {
		if (badFoods.contains(nomeAlimento))
			throw new BadFoodException();
		
		System.out.println("O alimento " + nomeAlimento +
				" é adequado!");
	}


}
