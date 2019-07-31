package br.com.alura.testes;

import br.com.alura.calcula.CalculadorDeImposto;
import br.com.alura.impostos.ICMS;
import br.com.alura.impostos.ISS;
import br.com.alura.impostos.Imposto;
import br.com.alura.orcamentos.Orcamento;

public class TesteDeImpostos {
	
	public static void main(String[] args) {
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iss);
		
	}
	
}
