package chainOfResposibility_TemplateMethod;
/**
 * classe de implementacao do composite criando uma cadeia de processos
 * usando a recursao com um ponto de parada
 * @author Fernando
 */
public class PosProcessadorComposto implements PosProcessador{
	
	private PosProcessador[] processadores;
	
	public PosProcessadorComposto(PosProcessador... processadores) {
		this.processadores = processadores;
	}
	
	@Override
	public byte[] processar(byte[] bytes) {
		for (PosProcessador p : processadores) {
			bytes = p.processar(bytes);
		}
		return bytes;
	}	
}
