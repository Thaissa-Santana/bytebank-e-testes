package bytebank_herdado;

public class TestaFuncionario {

		public static void main(String[] args) {
			
		//	Cliente cliente = new Cliente();
			
			Gerente nico = new Gerente();
			nico.setNome("Nico Steppat");
			nico.setCpf("223.355.646-90");
			nico.setSalario(2600.00);
			
			System.out.println(nico.getNome());
			System.out.println(nico.getBonificacao());
		}
	
}
