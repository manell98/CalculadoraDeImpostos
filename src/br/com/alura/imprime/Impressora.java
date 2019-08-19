package br.com.alura.imprime;

import br.com.alura.notaFiscal.AcaoAposGerarNota;
import br.com.alura.notaFiscal.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Imprime nota fiscal...");
	}
}
