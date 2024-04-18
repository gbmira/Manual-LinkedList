package entities;

public class Elemento<TIPO> {
	private TIPO valor;
	private Elemento<TIPO> proxElemento;
	
	public Elemento(TIPO novoValor) {
		this.valor = novoValor;
	}
	public TIPO getValor() {
		return valor;
	}
	public void setValor(TIPO valor) {
		this.valor = valor;
	}
	public Elemento<TIPO> getProxElemento() {
		return proxElemento;
	}
	public void setProxElemento(Elemento<TIPO> proxElemento) {
		this.proxElemento = proxElemento;
	}
	
	
}
