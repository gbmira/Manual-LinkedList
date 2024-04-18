package entities;

public class IteratorListaLigada<TIPO> {
	private Elemento<TIPO> elemento;
	
	public boolean temProximo() {
		if(elemento.getProxElemento() == null) {
			return false;
		}else {
			return true;
		}
	}
	
	public Elemento<TIPO> getProximo(){
		elemento = elemento.getProxElemento();
		return elemento;
	}
	
	public IteratorListaLigada (Elemento<TIPO> atual){
		this.elemento = atual;
	}
	
	
}
