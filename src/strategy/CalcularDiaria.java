package strategy;

public class CalcularDiaria implements CalcularValor {
	
	
	private double valorDiaria;
	
	
	public CalcularDiaria(double valorDiaria){
		this.valorDiaria = valorDiaria;
	}
	public double calcular( long periodo, Veiculo veiculo){
		
		return valorDiaria* Math.ceil(0/*periodo / hora*/);
		
	}
	
}
