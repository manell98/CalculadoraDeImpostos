package br.com.alura.testes;

import br.com.alura.orcamentos.Orcamento;

public class TesteDeDescontoExtra {

	public static void main(String[] args) {
		
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		
		reforma.aplicaDescontoExtra();
		
	}
	
}
