package br.com.alura.impostos;

import br.com.alura.orcamentos.Orcamento;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}

}
