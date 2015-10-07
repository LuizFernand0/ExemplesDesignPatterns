package adapter;
/**
 * Para evitar que as classes cliente precisem ser alteradas e se acoplarem a uma
nova API, decidiu-se criar um Adapter para traduzir as chamadas de uma interface
para outra, esse padrao e bem similar ao <code>Proxy_Decorador</code>
 * @author Fernando
 *Classe Nova Operadora
 */
public interface EnviadorSMS {

	public void enviarSMS(String destino, String origem, String[] msgs)
		throws Exception; //SMSException;
}
