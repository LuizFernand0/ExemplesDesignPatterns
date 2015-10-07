package Factory;

import dataAccessObject.DAO;
import templateMethod_Bridge.GeradorArquivo;

/**
 * 
 * @author Fernando
 * Classe concreta para representar os servicos da endidade Produto
 */
public class ServicoProduto extends ServicoAbstrato<Produto> {
	// Atributo DAO-Produto  
	private DAO<Produto> dao;
	
	public ServicoProduto(GeradorArquivo gerador) {
		super(gerador);
	}

	@Override
	public DAO<Produto> getDAO() {
		if (dao == null){
			dao = new ProdutoDAO();
		}
		return dao;
	}
	
	public double getPrecoProduto(Object produtoId){
		Produto p  = getDAO().procurar(produtoId);
		
		return p.getPreco();
	}
	
}
