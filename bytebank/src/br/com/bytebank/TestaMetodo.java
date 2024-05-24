package br.com.bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		// deposita Paulo
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		//saca Paulo
		contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		
		//transfere = Criar uma conta para a Marcela
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.saldo = 0;
		contaDaMarcela.deposita(1000);
		System.out.println(contaDaMarcela.saldo);
		
			if (contaDaMarcela.transfere (300, contaDoPaulo)) {
				System.out.println("Transferencia realizada com sucesso!"); 
			} else {
				System.out.println("Transferencia negada, faltou dinheiro!");
			}			
	}
}
