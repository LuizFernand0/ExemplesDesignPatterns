package proxy_decorator;

import java.io.IOException;

/**
 * Implementando o padrao proxy para varias tentativas de buscar o arquivo 
 * 
 * @author Fernando
 *
 */
public class TentativasRepetidas implements AcessoRemoto {
	//instancia do objeto encapsulado
	private AcessoRemoto ar;
	private int maximoTentativas;

	//deve receber a instancia do objeto encapsulado no contrutor
	public TentativasRepetidas(AcessoRemoto ar, int maximoTentativas) {
		this.ar = ar;
		this.maximoTentativas = maximoTentativas;
	}

	public byte[] buscarArquivo(String url) throws IOException {
		int tentativas = 0;
		IOException ultimoErro = null;
		
		
		while (tentativas < maximoTentativas) {
			try {
				return ar.buscarArquivo(url);
				
			} catch (IOException ex) {
				tentativas++;
				ultimoErro = ex;
			}
		}

		throw ultimoErro;
	}

}
