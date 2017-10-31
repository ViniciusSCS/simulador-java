package Especifico;

import Generico.Unidade;

public class Piqueiro extends Unidade {
	
	public boolean lutar(Unidade unidade){
		if(unidade instanceof Arqueiro)
			return true;
		
		return false;
	}
}
