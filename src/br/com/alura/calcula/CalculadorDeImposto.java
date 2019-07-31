package br.com.alura.calcula;

import br.com.alura.impostos.Imposto;
import br.com.alura.orcamentos.Orcamento;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}
}
