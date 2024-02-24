package view;

import controller.PotenciaController;

public class Main {

	public static void main(String[] args) {
		int base = 3;
		int expoente = 4;
		
		PotenciaController pCont = new PotenciaController();
		
		int potencia = pCont.Potencia(base, expoente);
		System.out.println(potencia);
			
	}
	
}
