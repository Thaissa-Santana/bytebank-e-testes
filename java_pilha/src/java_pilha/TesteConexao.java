 package java_pilha;

public class TesteConexao {

	public static void main(String[] args) throws Exception {
		
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao!");
		}
		
				
		
		// -------------------------------------------------

//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na Conexao");
//			
//		} finally {
//			con.close();
//		}

	}

}
