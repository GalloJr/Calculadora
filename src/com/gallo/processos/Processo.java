package com.gallo.processos;

import com.gallo.calculos.Calculo;
import com.gallo.io.Entrada;

public abstract class Processo {
	Calculo calculo;
	Entrada leitor;

	public abstract void processar();
}