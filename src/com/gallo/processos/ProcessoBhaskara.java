package com.gallo.processos;

import com.gallo.calculos.Bhaskara;
import com.gallo.io.Entrada;

public class ProcessoBhaskara extends Processo {
	@Override
	public void processar() {
		System.out.println("Digite o valor de A:");
		leitor = new Entrada();
		double numero1 = leitor.receberNumeroDouble();
		System.out.println("Digite o valor de B:");
		leitor = new Entrada();
		double numero2 = leitor.receberNumeroDouble();
		System.out.println("Digite o valor de C:");
		leitor = new Entrada();
		double numero3 = leitor.receberNumeroDouble();
		calculo = new Bhaskara();
		calculo.calcular(numero1, numero2, numero3);
	}

}