package proxy_decorator;

import java.io.IOException;

/**
 * ver <code>Composite trechos aereos</code> 
 * Entendendo o problema e solucao : ao buscar arquivos, devido a instabilidade do servidor
 * ocorria erros frequentes logo o padrao proxy 
 * O foco do padrao proxy e encapsular o objeto e implementar sua abstracao
 * provendo de novas funcionalidader ou não
 * @author Fernando
 */
public interface AcessoRemoto {
	
	public byte[] buscarArquivo(String url) throws IOException;

}
