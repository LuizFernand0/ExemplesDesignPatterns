package observer;

public class AcoesLogger implements Observador {

	@Override
	public void mudancaQuantidade(String acao, Integer qtd) {
		System.out.println(new StringBuilder("Alterada quantidade da acao" + acao +" para"+ qtd));
	}

}
