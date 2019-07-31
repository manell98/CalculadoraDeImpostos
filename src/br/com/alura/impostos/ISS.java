package br.com.alura.impostos;

import br.com.alura.orcamentos.Orcamento;

public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
