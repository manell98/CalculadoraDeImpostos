package br.com.alura.descontos;

import br.com.alura.orcamentos.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// nao tem proximo
	}

}
