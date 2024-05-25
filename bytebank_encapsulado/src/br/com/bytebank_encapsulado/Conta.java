package br.com.bytebank_encapsulado;

	public class Conta {
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total;
			
			public Conta(int agencia, int numero){
				Conta.total++;
				System.out.println("O total de contas é " + Conta.total);
				
				this.agencia = agencia;
				this.numero = numero;
				System.out.println("Criando uma conta " + this.numero);
	
			}
	
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
			
// método para editar um int numero
			
			//get
			public int getNumero() {
				return this.numero;
			}
			//set
			public void setNumero (int novoNumero) {
				if(numero <= 0) {
					System.out.println("Não pode valor menor ou igual a 0");
					return;  				//parar a execução
				}
				this.numero = novoNumero;
			}
			
			// int agencia		
			public int getAgencia() {
				return agencia;
			}
			public void setAgencia(int agencia) {
				if(agencia <= 0) {
					System.out.println("Não pode valor menor ou igual a 0");
					return;  				//parar a execução
				}
				this.agencia = agencia;
			}
			
// 		cliente titular
			public Cliente getTitular() {
				return titular;
			}
			public void setTitular(Cliente titular) {
				this.titular = titular;
			}
			
			public static int getTotal (){
				return Conta.total;
			}
			
}