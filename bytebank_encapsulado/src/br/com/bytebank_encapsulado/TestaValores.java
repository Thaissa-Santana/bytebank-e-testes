package br.com.bytebank_encapsulado;

public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//System.out.println(Conta.total); // não compia pois está privado.
	
		conta.setAgencia(1232123);
		
	//	Conta conta2 = new Conta(1337, 16549);
	//	System.out.println("A agencia da conta 2  é " + conta2.getAgencia());
		
	//	Conta conta3 = new Conta(2112, 14660);	
	//	System.out.println("A agencia da conta 3 é " + conta3.getAgencia());
		
		System.out.println("O total de contas é " + Conta.getTotal()); 
		
	}
}