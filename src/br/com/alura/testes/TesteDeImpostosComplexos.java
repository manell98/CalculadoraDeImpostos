package br.com.alura.testes;

import br.com.alura.impostos.ICMS;
import br.com.alura.impostos.ISS;
import br.com.alura.impostos.Imposto;
import br.com.alura.orcamentos.Orcamento;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500.0);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
	}
	
}
