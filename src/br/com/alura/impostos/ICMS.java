package br.com.alura.impostos;

import br.com.alura.orcamentos.Orcamento;

public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
