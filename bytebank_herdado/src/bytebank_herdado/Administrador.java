package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil util;
	
	public Administrador() {
		this.util = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
	
}