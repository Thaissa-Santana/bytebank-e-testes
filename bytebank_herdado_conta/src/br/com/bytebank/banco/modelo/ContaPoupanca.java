package br.com.bytebank.banco.modelo;
								
								//Object
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
	@Override
	public String toString() {
		
		return "ContaPoupanca, " + super.toString();
		
//		return "ContaPoupanca, Numero: " + super.getNumero();
	}
	
}
