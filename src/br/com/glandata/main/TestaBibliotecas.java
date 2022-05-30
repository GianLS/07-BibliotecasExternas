package br.com.glandata.main;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.glandata.models.Pessoa;

public class TestaBibliotecas {

	public static void main(String[] args) {
		Formatter formatter = new CPFFormatter();

		Pessoa pessoa = new Pessoa("Adalberto", "40038545861");
		String cpfNaoFormatado = pessoa.getCpf();
		String cpfFormatado = formatter.format(cpfNaoFormatado);
		pessoa.setCpf(cpfFormatado);
		System.out.println(pessoa);

		Pessoa pessoinha = new Pessoa("Adalberto", formatter.format("40038545861"));
		System.out.println(pessoinha);

	}

}
