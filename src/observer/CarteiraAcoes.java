package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe cujos dados podem ser observados por outras classes: Logo esta
 *  tera que ter como atributo uma lista de observadores 
 * 
 * @author Fernando
 */
public class CarteiraAcoes {
	
	private Map<String,Integer > acoes = new HashMap<>();
	//lista de observadores
	private List<Observador> obs = new ArrayList<>();
	
	public void adicionaAcoes(String acao, Integer qtd ){
		if (acoes.containsKey(acao)){
			qtd = qtd + acoes.get(acao);
		}
		acoes.put(acao, qtd);
		notificar(acao, qtd);
		
	}

	private void notificar(String acao, Integer qtd) {
		for (Observador o : obs){
			o.mudancaQuantidade(acao, qtd);
		}
	}
	
	/**
	 * @param observador Add uma nova classe observadora
	 * 
	 */
	public void addObserver(Observador observador){
		obs.add(observador);
	}
}
