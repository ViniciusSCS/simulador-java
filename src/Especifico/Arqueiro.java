package Especifico;

import Generico.Unidade;

public class Arqueiro extends Unidade {
	
	public boolean lutar(Unidade unidade){
		if(unidade instanceof Cavaleiro)
			return true;
		
		return false;
	}
}
