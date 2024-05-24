package br.com.bytebank;

public class CriaConta {
	
	// Referência: primeiraConta, segundaConta.
	//
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo= 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;                      // +=
		
		System.out.println("primeira conta tem: " + primeiraConta.saldo);
		System.out.println("segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
	}
}
