package adapter;
/**
 * Classe que implementa o padrao Adapter adaptando uma interface a outra
 * @author Fernando
 *
 */
public class SMSAdapter implements SMSSender {
	//recebe a classe da nova operadora  
	private EnviadorSMS enviador;
	public SMSAdapter(EnviadorSMS enviador){
		this.enviador = enviador;
	}
	
	@Override
	public boolean senderSMS(SMS sms) {
		String destino = sms.getDestino();
		String origem = sms.getOrigem();
		//adaptando o methodo
		String [] texto = quebrarMsg(sms.getTexto());
		
		try {
			
			enviador.enviarSMS(destino, origem, texto);
			
		}catch(Exception ex){
			return false;
		}
		return true;
	}
	/**
	 * 
	 * @param texto - recebe o texto a ser adaptado
	 * @return retorna a manssagem tratada em array 
	 */
	private String[] quebrarMsg(String texto) {
		int size = texto.length();
		//se for divisivel por 160 entao a quantidade é a divisao por 160
		//caso nao for a quantidade é a divisao + 1 
		int qtd = (159%160==0)? size/160 :size/160 + 1;
		
		String[] msg = new String[qtd];
		
		for (int i = 0; i < qtd; i ++) {
			//pega a posicao do primeiro caracter a ser enviado
			int primeiroCaracter = i *160;
			
			//pergunta se é a ultima menssagem a ser enviada e faz  o calculo de acordo
			int ultimoCaracter = (i == qtd-1)? size: (i+1)*160;
			
			msg[i] = texto.substring(primeiroCaracter,ultimoCaracter);
		}
		
		return msg;
	}
}
