package br.com.alura.descontos;

import br.com.alura.orcamentos.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
	
}
