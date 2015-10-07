package NullObject;


public class CookieFactory {
	
	private Carrinho carrinho;
	
	public Carrinho criarCarrinho(String request){
		//condiçoes para criar carrinho...
		if ( true){
			return carrinho = new Carrinho();
		}else{
			return carrinho = new CarrinhoNulo();
		}
	}

}
