package br.com.alura.impostos;

import br.com.alura.itens.Item;
import br.com.alura.orcamentos.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {
	
	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item: orcamento.getItens()) {
			if(item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

}
