package sintaxe_variaveis_e_fluxo;

public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;
		
		for (int n = 1; n <= 10; n++) {
			fatorial *= n;
			System.out.println("Fatorial de " + n + " = " + fatorial);	
		}
	}
}