package bytebank_composto;

	public class Conta {
		private double saldo;
		int agencia;
		int numero;
		Cliente titular;
	
			public void deposita (double valor) {
					this.saldo += valor; 												    // testado e ok
			}
			
			public boolean saca (double valor) {
																										// testado e ok
					if (this.saldo >= valor) {
						this.saldo -= valor;
						return true;	
					} else {
						return false;		
					}
			}
			
			public boolean transfere (double valor, Conta destino) {	
					if ( this.saldo >= valor) {
						this.saldo -= valor;
						destino.deposita(valor);
						return true;
					}
					return false;		
			}
										// desafio: alterar o método transfere para reutilizar nosso código implementado em <saca> para simplificar o código.
			
  //	método que retorne o saldo que está privado:
			
			public double getSaldo() {
				return this.saldo;
			}
			
			
			
		
}