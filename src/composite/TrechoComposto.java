package composite;

/**
 * Devemos pensar em um cesto de frutas que esta em promoçao
 * dentro do mesmo contem inumeros tipos de frutas que partilham de um mesmo tipo
 * logo sabemos que este cesto nao é uma fruta porem tem em sua composicao frutas e precisa 
 * realizar operacoes com estas frutas para chegar a uma comclusao logo temos o composite
 * 
 * <code>Exemplo viagens compostas</code> 
 * @author Fernando
 *
 */
public class TrechoComposto implements TrechoAereo {

	private TrechoAereo primeiro;
	private TrechoAereo segundo;
	private double taxaconexao;
	
	// no construtor é passado as composicoes
	public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo,
			double taxaconexao) {
		
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.taxaconexao = taxaconexao;
		
		if (primeiro.getDestino() != segundo.getOrigem())
			throw new RuntimeException("O destino do primeiro"
					+ "não é igual a origem do segundo");
	}
	@Override
	public String getOrigem() {
		return primeiro.getOrigem();
	}
	@Override
	public String getDestino() {
		return segundo.getDestino();
	}
	@Override
	public double getPreco() {
		return primeiro.getPreco() + segundo.getPreco() + taxaconexao;
	}
}
