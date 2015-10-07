package chainOfResponsibility;

/**
 * O objetivo deste padrao é criar uma cadeia de execulsao, criando uma sequencia de execulsao 
 * delegando as etapas de classe em classe conforme vao sendo cumpridas 
 * 
 * @author Fernando
 *
 */
// a intensao é tentar recuperar o arquivo primeiro no cash se nao achar tentar no banco
public abstract class RecuperadorArquivo {
	
	private RecuperadorArquivo proximo;
	
	public RecuperadorArquivo(RecuperadorArquivo proximo){
		this.proximo = proximo;
	}
	//tenta recuperar primeiro caso nao consiga chama o proximo e tenta recuprar usando o mesmo metodo
	public Arquivo recuperar(String nome){
		Arquivo a  = recuperarArquivo(nome);		
				
		if (nome == null||!a.isValido()) //return nome == null || !a.isValido()? chamarProximo(nome) : a;
			return chamarProximo(nome);	
		else 
			return a;
	}
	// As classes filhas podem sobreescrever este metodo pois elas podem definir quando deve ser chamados  
	protected Arquivo chamarProximo(String nome){
		if(proximo==null)
			throw new RuntimeException("Nao foi possivel recuperar o arquivo");
		
		return proximo.recuperar(nome);
	}
	protected abstract Arquivo recuperarArquivo (String nome);
}
