package br.com.alura.dao;

import br.com.alura.notaFiscal.AcaoAposGerarNota;
import br.com.alura.notaFiscal.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Salvando no bd...");
	}
}
