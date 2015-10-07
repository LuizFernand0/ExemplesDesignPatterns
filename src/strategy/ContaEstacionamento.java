package strategy;

/**
 *  @author Fernando
 *  PONTOS POSITIVOS
 * O Strategy é um padrão que deve ser utilizado quando uma classe possuir
 * diversos algoritmos que possam ser utilizados de forma intercambiável. A solução
 * proposta pelo padrão consiste em delegar a execução do algoritmo para uma instância que compõe a classe principal
 */
public class ContaEstacionamento {
/** PONTOS NEGATIVOS
 *  acontece no aumento da complexidade na criação do objeto,
	pois a instância da dependência precisa ser criada e configurada. Caso o atributo
	seja nulo, a classe pode apresentar um comportamento inesperado. Outro problema
	dessa solução está no aumento do número de classes
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
