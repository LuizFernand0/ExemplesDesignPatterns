package recursao;

/**
 * Recursao é um metodo que chama a si proprio para minimizar ao extremo a
 * resolucao de um problema
 * 
 * @author Fernando
 */
public class Elemento {
	
	private Object valor;
	private Elemento proximo;

	public Elemento(Object valor) {
		this.valor = valor;
	}

	public Object getValor() {
		return valor;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	// Metodo Recursivo, devemos sempre definir um ponto de parada ou seja de conclusao
	public int contar() {
		if (proximo == null)
			return 1;
		return 1 + proximo.contar();
	}
}
