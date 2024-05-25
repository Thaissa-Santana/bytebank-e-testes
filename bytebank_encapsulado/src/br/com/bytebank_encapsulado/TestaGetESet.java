package br.com.bytebank_encapsulado;

public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		// criar um cliente
		Cliente paulo = new Cliente();
		// conta.titular = paulo; - não compila pois está privado;
		conta.setTitular(paulo);
		
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		// agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}

}
