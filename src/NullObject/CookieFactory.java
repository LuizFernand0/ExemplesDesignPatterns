package NullObject;


public class CookieFactory {
	
	private Carrinho carrinho;
	
	public Carrinho criarCarrinho(String request){
		//condi�oes para criar carrinho...
		if ( true){
			return carrinho = new Carrinho();
		}else{
			return carrinho = new CarrinhoNulo();
		}
	}

}
