//package br.com.bytebank.banco.modelo;
//
///**
// * Classe que representa a moldura de uma conta
// * 
// * @author Thaissa S Santos
// */
//
//public abstract class Object {
//	
//	protected double saldo;
//	private int agencia;
//	private int numero;
//	private Cliente titular;
//	private static int total;
//	
//	
//	/**
//	 * Construtor para inicializar o objeto conta a partir de agencia e numero.
//	 * 
//	 * @param agencia
//	 * @param numero
//	 */
//		
//		public Object(int agencia, int numero){
//			Object.total++;
//			//System.out.println("O total de contas é " + Conta.total);
//			this.saldo = 100;
//			this.agencia = agencia;
//			this.numero = numero;
//			//System.out.println("Criando uma conta " + this.numero);
//	
//			}
//	
//			public abstract void deposita (double valor);
//			
//			/**
//			 * 
//			 * @param valor
//			 * @return
//			 */
//			
//			public void saca(double valor) throws SaldoInsuficienteException {
//																										// testado e ok
//					if (this.saldo < valor) {
//						throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
//					} 
//					this.saldo -= valor;
//			}
//			
//			public boolean transfere (double valor, Object destino) {	
//					if ( this.saldo >= valor) {
//						this.saldo -= valor;
//						destino.deposita(valor);
//						return true;
//					}
//					return false;		
//			}
//					// desafio: alterar o método transfere para reutilizar nosso código implementado em <saca> para simplificar o código.
//			
//  //	método que retorne o saldo que está privado:	
//			public double getSaldo() {
//				return this.saldo;
//			}
//			
//// método para editar um int numero
//			
//			//get
//			public int getNumero() {
//				return this.numero;
//			}
//			//set
//			public void setNumero (int novoNumero) {
//				if(numero <= 0) {
//					System.out.println("Não pode valor menor ou igual a 0");
//					return;  				//parar a execução
//				}
//				this.numero = novoNumero;
//			}
//			
//			// int agencia		
//			public int getAgencia() {
//				return agencia;
//			}
//			public void setAgencia(int agencia) {
//				if(agencia <= 0) {
//					System.out.println("Não pode valor menor ou igual a 0");
//					return;  				//parar a execução
//				}
//				this.agencia = agencia;
//			}
//			
//// 		cliente titular
//			public Cliente getTitular() {
//				return titular;
//			}
//			public void setTitular(Cliente titular) {
//				this.titular = titular;
//			}
//			
//			public static int getTotal (){
//				return Object.total;
//			}
//			
//}