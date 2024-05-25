package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posicaoLivre = 0;
	
	public GuardadorDeReferencias(){
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
		
	}
	
	public void adiciona(Object ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}