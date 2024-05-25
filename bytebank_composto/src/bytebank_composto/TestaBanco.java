package bytebank_composto;

public class TestaBanco {
	
	 public static void main (String[] args) {
		 // testar instanciando um cliente e uma conta
		 
		 Cliente paulo = new Cliente();         //cliente criado
		 paulo.nome = "Paulo Silveira";
		 paulo.cpf = "222.222.222-22";
		 paulo.profissao = "Programador";
		 
		Conta contaDoPaulo = new Conta();       //conta criada
		contaDoPaulo.deposita(100);
		
	// associar o cliente paulo a contaDoPaulo
		 contaDoPaulo.titular = paulo;
		 System.out.println(contaDoPaulo.titular.nome);
		 
	 }
	 
}