package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Mario";
		String outro = new String("Alura");
		
		String novo = outro.replace("A", "a");
//		System.out.println(nome);
		
	//	String novo = nome.toLowerCase(); //também teste toUpperCase()
	//	String novo = nome.toUpperCase(); 
		System.out.println(novo);
		

		char c = nome.charAt(2); //char i
		System.out.println(c);

		int pos = nome.indexOf("rio");
		System.out.println(pos);

		String sub = nome.substring(1);
		System.out.println(sub);
		
		for (int i = 0; i < nome.length(); i++) {
		System.out.println(nome.charAt(i));
		}
	
	}
	
}