package controller;

public class PotenciaController {
	
	public PotenciaController() {
		super();
	}
	
	public int Potencia (int base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else {
			return base * Potencia(base, expoente - 1);
		}
	}
}
