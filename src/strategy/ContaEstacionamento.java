package strategy;

/**
 *  @author Fernando
 *  PONTOS POSITIVOS
 * O Strategy � um padr�o que deve ser utilizado quando uma classe possuir
 * diversos algoritmos que possam ser utilizados de forma intercambi�vel. A solu��o
 * proposta pelo padr�o consiste em delegar a execu��o do algoritmo para uma inst�ncia que comp�e a classe principal
 */
public class ContaEstacionamento {
/** PONTOS NEGATIVOS
 *  acontece no aumento da complexidade na cria��o do objeto,
	pois a inst�ncia da depend�ncia precisa ser criada e configurada. Caso o atributo
	seja nulo, a classe pode apresentar um comportamento inesperado. Outro problema
	dessa solu��o est� no aumento do n�mero de classes
 */
	private Veiculo veiculo;
	private long inicio, fim;
	private CalcularValor tipoDeCalculo;
	
	public double valorConta(){
		
		return tipoDeCalculo.calcular(fim-inicio,veiculo);
	}
	
	public void setCalculo(CalcularValor tipoDeCalculo){
		this.tipoDeCalculo = tipoDeCalculo;
	}
}
