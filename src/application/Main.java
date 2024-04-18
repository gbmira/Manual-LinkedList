package application;

import java.util.Iterator;

import entities.ListaLigada;

public class Main {

	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adicionar("ac");
		lista.adicionar("bc");
		lista.adicionar("dc");
		lista.adicionar("ec");
		lista.adicionar("fc");
		
		lista.remover("fc");
		lista.remover("dc");
		
		for(int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
	}

}
