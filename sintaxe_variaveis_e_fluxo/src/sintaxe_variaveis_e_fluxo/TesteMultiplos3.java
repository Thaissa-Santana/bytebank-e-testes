package sintaxe_variaveis_e_fluxo;

public class TesteMultiplos3 {

	public static void main(String[] args) {
		// multiplos de 3 entre 1 e 100
		
		for (int multiplo = 1; multiplo < 100; multiplo++) {
			
			if (multiplo % 3 == 0) {
				System.out.println(multiplo);
			}
		}
	}
}