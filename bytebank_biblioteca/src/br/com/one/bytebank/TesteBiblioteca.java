package br.com.one.bytebank;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.*;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200.5);
		System.out.println(c.getSaldo());
		
	}

}
