package bytebank_composto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());   // o java zera o argumento "()" é obrigatório.
		
		contaDaMarcela.titular = new Cliente();      // criando a referencia
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela Santos";
		System.out.println(contaDaMarcela.titular.nome);

	}
}
