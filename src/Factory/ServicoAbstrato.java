package Factory;
import dataAccessObject.DAO;
import templateMethod_Bridge.GeradorArquivo;

//Servico DAO 
/**
 * @author Fernando
 *
 * @param <E> Tipo Generico  pra representar as Entidades 
 * A classe ServicoAbstrato representa uma classe da camada de negócios que
 * contém serviços relacionados a uma entidade. 
 * Para prover sua funcionalidade, ela precisa da colaboração do DAO relacionado a mesma entidade
 */
public abstract class ServicoAbstrato<E> {
	
	public GeradorArquivo gerador;
	
	public ServicoAbstrato(GeradorArquivo gerador){
		this.gerador = gerador;
	}
	
	/**
	 * @return
	 * Padrao <code>Factory<code> delega a criacao do objeto para a subClasse
	 */
	public abstract DAO<E> getDAO();
	
	//Servico Geral
	public void gravarEntidadeEmArquivo(Object id,String nomeArquivo){
		E entidade = getDAO().procurar(id);
		
		gerador.gerarArquivo(nomeArquivo, ((Entidade)entidade).getMapa);
	}
}
