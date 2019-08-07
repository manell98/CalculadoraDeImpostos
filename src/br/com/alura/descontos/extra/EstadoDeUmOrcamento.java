package br.com.alura.descontos.extra;

import br.com.alura.orcamentos.Orcamento;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	
	void reprova(Orcamento orcamento);
	
	void finaliza(Orcamento orcamento);
	
}
