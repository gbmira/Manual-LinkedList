package entities;

import java.util.Iterator;

public class ListaLigada<TIPO> {
	private Elemento<TIPO> primeiro;
	private Elemento<TIPO> ultimo;
	private int tamanho;

	public ListaLigada() {
		this.tamanho = 0;
	}

	public Elemento<TIPO> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento<TIPO> primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento<TIPO> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento<TIPO> ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void adicionar(TIPO novoValor) {
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else {
			this.ultimo.setProxElemento(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;

	}

	public void remover(TIPO valorProcurado) {
		Elemento<TIPO> anterior = null;
		Elemento<TIPO> atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) {
			if (atual.getValor().equals(valorProcurado)) {
				if (this.getTamanho() == 1) {
					this.primeiro = null;
					this.ultimo = null;
				} else if (atual == primeiro) {
					this.primeiro = atual.getProxElemento();
					atual.setProxElemento(null);
				} else if (atual == ultimo) {
					this.ultimo = anterior;
					anterior.setProxElemento(null);
				} else {
					anterior.setProxElemento(atual.getProxElemento());
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProxElemento();
		}
	}

	public Elemento get(int posicao) {
		Elemento atual = this.primeiro;
		for (int i = 0; i < posicao; i++) {
			if (atual.getProxElemento() != null) {
				atual = atual.getProxElemento();
			}
		}
		return atual;
	}
	
	public IteratorListaLigada<TIPO> getIterator(){
		return new IteratorListaLigada<TIPO>(this.primeiro);
	}

}
