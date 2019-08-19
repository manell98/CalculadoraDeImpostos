package br.com.alura.testes;

import br.com.alura.dao.NotaFiscalDao;
import br.com.alura.enviador.EnviadorDeEmail;
import br.com.alura.enviador.EnviadorDeSms;
import br.com.alura.imprime.Impressora;
import br.com.alura.notaFiscal.ItemDaNota;
import br.com.alura.notaFiscal.NotaFiscal;
import br.com.alura.notaFiscal.NotaFiscalBuilder;

public class TesteAcoes {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123456").com(new ItemDaNota("Placa de video", 400))
				.observacoes("obs qualquer").naDataAtual().constroi();
		
		System.out.println(nf.getValorBruto());

	}

}
