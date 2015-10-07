package observer;
/**
 * Classe <code>Observer</code> o objetivo e comunicar todas as classe que o atributo ou estado
 *  de uma classe foi alterada
 * @author Fernando
 *
 */
public interface Observador {

	void mudancaQuantidade(String acao, Integer qtd);

}
