package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

// ps falta terminar a implementação da aula 04, atv 01 "O método equals"

public class TesteArrayListEquals {

	public static void main(String[] args) {
	
//		Conta cc1 = new ContaCorrente(22, 11);
//	    Conta cc2 = new ContaCorrente(22, 22);
//	    Conta cc3 = new ContaCorrente(22, 22);
	    
//	    boolean igual = cc1.ehIgual(cc2);
//	    System.out.println(igual);
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
	
		 Conta cc1 = new ContaCorrente(22, 11);
	     lista.add(cc1);

	     Conta cc2 = new ContaCorrente(22, 22);
	      lista.add(cc2);
	     
	     Conta cc3 = new ContaCorrente(22, 22);  //33, 311
	     boolean existe = lista.contains(cc3);
	     
	     System.out.println("Já existe? " + existe);	 
	    	     
	     for (Conta conta: lista) {
	    	 System.out.println(conta);
	     }
	     
	}

}
