package com.gallo.calculos;

public class Radiciacao extends Calculo {
	
	private Calculo potencia = new Potenciacao();

	@Override
	public double calcular(double indice, double radicando) {
		return potencia.calcular(radicando, (1.0 / indice));
	}

	@Override
	public void calcular(double numero1, double numero2, double numero3) {
		
	}

}