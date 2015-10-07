package state;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class No {
	private Set<No> adjacentes = new HashSet<>();
	// private Cor cor
	/**
	 * Padrão states delegando para Enum
	 */
	private CorEnum cor;
	private String name;
	
	public No(String name) {
		this.name = name;
		//cor = new Branca();
		// Padrao states delegando business de estado para Enum 
		cor = CorEnum.BRANCO;
	}
	public void buscaProfundidade(List<No> list) {
		cor.busca(this, list);
	}
	public Set<No> getAdjacentes() {
		return adjacentes;
	}
	public void addAdjacentes(No adj) {
		adjacentes.add(adj);		
	}
	
	public void setCor(CorEnum cor, List<No> list) { 
		this.cor = cor;
		cor.assumiu(this, list);
	}
	@Override
	public String toString() {
		return name; 
	}
}
