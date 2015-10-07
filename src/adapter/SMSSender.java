package adapter;
/**
 * Classe que precisa ser adaptada para outra operadora de envio de SMS 
 * @author Fernando
 *
 */
public interface SMSSender {
	
	public boolean senderSMS (SMS sms);
}
