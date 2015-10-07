package templateMethod_Bridge;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * Template method  + Bridge
 * @author Fernando
 */
public abstract class GeradorArquivo {
	
	/**
	 * PADRAO BRIDGE
	 * Essa solução caracteriza o padrão Bridge, que cria uma ponte entre duas hi-
	 *	erarquias ligadas por uma relação de composição permitindo que ambas variem de
	 *	forma independente. Nesse caso, a ponte é caracterizada pela relação de composição
	 *	entre a classe GeradorArquivo e a interface PosProcessador. 
	 */
	private PosProcessador processador;
		
	
	
	public void setProcessador(PosProcessador processador) {
		this.processador = processador;
	}

	// modificador Final , pois o metodo "Gancho" nao pose ser  modificado
	public final void gerarArquivo(String nome,
			Map<String, Object> propriedades)
			throws IOException{

		// chamando metodo abstrato
		String conteudo  = gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		
		// passando para o metodo o proprio byte 
		bytes = processador.processar(bytes);
		
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}
	
	protected abstract String gerarConteudo(Map<String, Object> propriedades);
	
	/**
	 * Por default esse method nao realiza nada.
	 * @param bytes
	 * @return
	 * @throws IOException
	 */
	// com o Padrao Bridge esse methodo nao se faz necessario
	/*protected byte[] processar (byte[] bytes)throws IOException{
		return bytes;
	}*/
}
