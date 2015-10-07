package NullObject;
/**
 * Classe para representar o Carrinho NULL
 * @author Fernando
 *
 */
public class CarrinhoNulo extends Carrinho {

	public double getValor() {
		return 0.0;
	}

	public int getTamanho() {
		return 0;
	}

	public String getNomeUsuario() {

		return "Faça Login";
	}

}
