package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object [] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente (22, 11);
		referencias [0] = cc1;
		
//		ContaPoupanca cp2 = new (ContaPoupanca) contas[1]; //type cast		
		ContaPoupanca cp2 = new ContaPoupanca (22, 22);
		referencias [1] = cp2;
		
		Cliente cliente = new Cliente();
		referencias [2] = cliente;
		
//		Object referenciaGenerica = contas[1];
//		System.out.println(referenciaGenerica[1].getNumero());
		
		System.out.println(cc1.getNumero());
		System.out.println(cp2.getNumero());
		
				
		
	}

}

