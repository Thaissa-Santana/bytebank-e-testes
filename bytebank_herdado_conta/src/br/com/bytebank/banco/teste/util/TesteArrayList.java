package br.com.bytebank.banco.teste.util;

//import java.util.Collections;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
								//ArrayList, LinkedList, Vector
		List<Conta> lista = new LinkedList<Conta>();
	
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
	    lista.add(cc2);
	     
	    System.out.println("Tamanho: " + lista.size());
	    Conta ref = (Conta) lista.get(0);
	    System.out.println(ref.getNumero());
	     
	    lista.remove(0);
	     
	    System.out.println("Tamanho: " + lista.size());
	     
	    Conta cc3 = new ContaCorrente(33, 311);
	    lista.add(cc3);

	    Conta cc4 = new ContaCorrente(33, 322);
	    lista.add(cc4);
	     
	    for (int i = 0; i < lista.size(); i++) { 
	    	Conta oRef = (Conta) lista.get(i);
	    	System.out.println(oRef);
	    	 
	    }
	     
	    System.out.println("------------------------------------------------------------");
	     
	    for (Conta conta: lista) {
	    	System.out.println(conta);
	    }
	     
	}

}
