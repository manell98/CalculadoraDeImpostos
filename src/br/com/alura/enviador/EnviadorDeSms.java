package br.com.alura.enviador;

import br.com.alura.notaFiscal.AcaoAposGerarNota;
import br.com.alura.notaFiscal.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("Enviando por sms...");
	}
}
