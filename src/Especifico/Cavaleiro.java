package Especifico;

import Generico.Unidade;

public class Cavaleiro extends Unidade {
	
	public boolean lutar(Unidade unidade){
		if(unidade instanceof Piqueiro)
			return true;
		
		return false;
	}
}
