package com.gallo.calculos;

public class Bhaskara extends Calculo {

	double delta, x1, x2;
	
	@Override
	public void calcular(double numero1, double numero2, double numero3) {
		
		delta = (numero2 * numero2) + (-4 * (numero1 * numero3));
		if (delta >= 0) {
			x1 = (double) ((-(numero2) + Math.sqrt(delta)) / 2 * numero1);
	        x2 = (double) ((-(numero2) - Math.sqrt(delta)) / 2 * numero1);
	 
	        System.out.println(x1);
			System.out.println(x2);
        } else {
            System.out.println("Delta não possui raiz!");
        }
	}

	@Override
	public double calcular(double numero1, double numero2) {
		// TODO Auto-generated method stub
		return 0;
	}
}