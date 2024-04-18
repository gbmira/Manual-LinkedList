package application;

import java.util.Iterator;

import entities.Elemento;
import entities.IteratorListaLigada;
import entities.ListaLigada;

public class Comparacao {

	public static void main(String[] args) {
		ListaLigada<Integer> lista = new ListaLigada<Integer>();
		
		for(int i = 0; i < 10000; i++) {
			lista.adicionar(i);
		}
		
		long tempoInicial;
		long tempoFinal;
		
		IteratorListaLigada<Integer> iterator = lista.getIterator();
		
		tempoInicial = System.currentTimeMillis();
		
		while(iterator.temProximo()) {
			iterator.getProximo();
		}
		tempoFinal = System.currentTimeMillis();
		
		System.out.println(tempoFinal - tempoInicial);
	}

}
