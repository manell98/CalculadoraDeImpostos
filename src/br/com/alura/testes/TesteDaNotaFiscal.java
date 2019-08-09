package br.com.alura.testes;

import br.com.alura.notaFiscal.ItemDaNota;
import br.com.alura.notaFiscal.NotaFiscal;
import br.com.alura.notaFiscal.NotaFiscalBuilder;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum")
		.comCnpj("12.345.678/001-12")
		.com(new ItemDaNota("Item 1", 200.0))
		.com(new ItemDaNota("Item 2", 300.0))
		.com(new ItemDaNota("Item 3", 400.0))
		.observacoes("Qualquer coisa")
		.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
		
	}
	
}
