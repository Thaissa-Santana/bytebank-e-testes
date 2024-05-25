
package bytebank_herdado;

//Contrato Autenticável
	//Quem assina esse contrato tem que implementar os seus métodos.
	//toda essa classe com os métodos em abstract 
		//metodo set senha
		//metodo autentica

public abstract interface Autenticavel {					 
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}