package br.com.alura.testes;

import br.com.alura.descontos.CalculadorDeDescontos;
import br.com.alura.itens.Item;
import br.com.alura.orcamentos.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {
		
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(520.0);
		orcamento.adicionaItem(new Item("Roteador", 250.0));
		orcamento.adicionaItem(new Item("Teclado", 270.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
		
	}
	
}
