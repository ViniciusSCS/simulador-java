package Generico;

import java.util.Random;

public class Simulador {
	
	public void simular(){
		
		Random random = new Random();
		int value = random.nextInt(10);
		
		Unidade und1 = exercito1.getUnidade();
		Unidade und2 = exercito2.getUnidade();
		
		boolean vence = und1.lutar(und2);
		
		if(vence)
			exercito2.remove(und2);
		else
			exercito1.remove(und1);
	}
}
