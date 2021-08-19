package com.gallo.calculos;

// int 1,2,3,4,5,6,7,-1,-2,-3,-4...
// float 1.3, 4.5, -0.2... => 32bits reduzida
// double =>  o dobro do float, 64bits


public abstract class Calculo {
	public abstract double calcular(double numero1, double numero2);
	
	public abstract void calcular(double numero1, double numero2, double numero3);
}