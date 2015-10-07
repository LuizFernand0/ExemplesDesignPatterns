package chainOfResponsibility;

import java.util.HashSet;
import java.util.Map;

public class RecuperadorCacheMemoria extends RecuperadorArquivo {

	private Map<String,Arquivo> cache	=  new HashSet<>();
	
	public RecuperadorCacheMemoria(RecuperadorArquivo proximo) {
		super(proximo);
	}
	
	@Override
	protected Arquivo recuperarArquivo(String nome) {
		if (cache.containsKey(nome))
			return cache.get(nome);
		
		return null;
	}

	@Override
	protected Arquivo chamarProximo(String nome) {
		Arquivo a = super.chamarProximo(nome);
		
		cache.put(nome, a);
		return a;
	}

}
