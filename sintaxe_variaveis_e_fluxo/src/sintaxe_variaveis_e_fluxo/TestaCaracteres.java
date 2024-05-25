package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;             // compila!
		System.out.println(valor);
		
		// valor = valor + 1;           // não compila!
		// System.out.println(valor);
	
		valor = (char) (valor + 1);           //compila!
		System.out.println(valor);
		
		String palavra = "alura cursos oline de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
