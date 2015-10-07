package StaticFactoryMethod;

import templateMethod_Bridge.GeradorArquivo;
import templateMethod_Bridge.PosProcessador;

/**
 * Com a implementacao dos padraos apresentados fica complexo escolher
 * os objetos a serem criados quando se usuflui dos padroes Proxy, Template entre outros
 * para desmitificar esse processo  temos o padrao <code>Static Factory Method</code>
 * @author Fernando
 *
 */
public abstract class FabricaGerador {

	public static final String ZIP = "ZIP";
	public static final String CRYPTO = "CRYPTO";
	
	public static GeradorArquivo criarGeradorXML (String... processadores){
		
		GeradorArquivo g = new GeradorXML();
		g.setProcessador(criarProcessador(processadores));
		
		return g;
	}
	public static GeradorArquivo criarGeradorPropriedades(String... processadores){
		
		GeradorArquivo g = new GeradorPropriedades();
		g.setProcessador(criarProcessador(processadores));
		return g;
	}
	private static PosProcessador criarProcessador(String[] processadores) {
		
		if (processadores.lengh > 1){
			PosProcessadorComposto pp = new PosProcessadorComposto();
			for (String proc : processadores){
				pp.add(criarProcessador(proc));
			}
			return pp;
		} else if(processadores[0].equals(ZIP)){
			return new Compactador();
		}else if (processadores[0].equals(CRYPTO)){
			return new Criptografador();
		}
	}
	
}
