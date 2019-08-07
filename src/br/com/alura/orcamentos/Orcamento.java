package br.com.alura.orcamentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.descontos.extra.EmAprovacao;
import br.com.alura.descontos.extra.EstadoDeUmOrcamento;
import br.com.alura.itens.Item;

public class Orcamento {

	public double valor;
	private final List<Item> itens;
	
	public EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}
	
	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.aprova(this);
	}
	
	public void finaliza() {
		estadoAtual.aprova(this);
	}

}
