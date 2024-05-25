package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Thaissa
 *
 */
 							// extends Object - java.lang
	public abstract class Conta extends Object implements Comparable<Conta>{
		
		protected double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total = 0;
		
		/**
		 * Construtor para inicializar o objeto Conta a partir da 
		 * 
		 * @param agencia
		 * @param numero
		 */
			
			public Conta (int agencia, int numero) {
				Conta.total++;
				//System.out.println("O total de contas é " + Conta.total);
			
				this.agencia = agencia;
				this.numero = numero;
				//this.saldo = 100;
				//System.out.println("Criando uma conta " + this.numero);
	
			}
	
			public abstract void deposita (double valor);
			
			/**
			 * Valor precisa ser maior que o saldo
			 * 
			 * @param valor
			 * @return
			 */
			
			public void saca (double valor) throws SaldoInsuficienteException{
																										// testado e ok
					if (this.saldo < valor) {	
						throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
					} 
					this.saldo -= valor;
			}
			
			public void transfere (double valor, Conta destino) throws SaldoInsuficienteException{	
						this.saca(valor);
						destino.deposita(valor);			
			}
			
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
			public void setNumero (int numero) {
				if(numero <= 0) {
					System.out.println("Não pode valor menor ou igual a 0");
					return;  				//parar a execução
				}
				this.numero = numero;
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
			
			public void setTitular (Cliente titular) {
				this.titular = titular;
			}
			
			public Cliente getTitular() {
				return this.titular;
			}
			
			public static int getTotal (){
				return Conta.total;
			}
			
			@Override
			public boolean equals (Object ref) {
				
				Conta outra = (Conta) ref;
				
				if (this.agencia != outra.agencia) {
					return false;
				}
				if (this.numero != outra.numero) {
					return false;
				}
				return true;	
			}
			
			@Override
			public int compareTo(Conta outra) {
				return Double.compare(this.saldo, outra.saldo);
			
			}
			
			@Override
			public String toString() { 											
				return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
				
			}
}