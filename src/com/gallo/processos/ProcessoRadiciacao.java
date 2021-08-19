package com.gallo.processos;

import com.gallo.calculos.Radiciacao;
import com.gallo.io.Entrada;

public class ProcessoRadiciacao extends Processo {
	@Override
	public void processar() {
		System.out.println("Digite o indice:");
		leitor = new Entrada();
		double numero1 = leitor.receberNumeroDouble();
		System.out.println("Digite o segundo numero para radicando:");
		leitor = new Entrada();
		double numero2 = leitor.receberNumeroDouble();
		calculo = new Radiciacao();
		double resultado = calculo.calcular(numero1, numero2);
		System.out.println("\nResultado: " + resultado + "\n");
	}

}