package com.gallo.calculos;

public class Potenciacao extends Calculo {
	@Override
	public double calcular(double base, double expoente) {
		return Math.pow(base, expoente);
	}

	@Override
	public void calcular(double numero1, double numero2, double numero3) {
		
	}
}