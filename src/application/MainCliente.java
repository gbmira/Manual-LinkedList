package application;

import entities.Cliente;
import entities.ListaLigada;

public class MainCliente {

	public static void main(String[] args) {
	ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
	clientes.adicionar(new Cliente("45576434678", "Biel Mira"));
	clientes.adicionar(new Cliente("33477854776", "Alex Mira"));
	clientes.adicionar(new Cliente("22888433289", "Jose Mira"));
	
	System.out.println(clientes.getTamanho());
			
	for (int i = 0; i < clientes.getTamanho(); i++) {
		System.out.println(clientes.get(i).getValor());
	}
	}

}
