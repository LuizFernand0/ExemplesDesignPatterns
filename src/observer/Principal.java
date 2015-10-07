package observer;

public class Principal {

	public static void main(String[] args)throws Exception {
		//inicianado Objetos 
		GraficoBarras gb = new GraficoBarras();
		AcoesLogger al = new AcoesLogger();
		CarteiraAcoes c = new CarteiraAcoes();

		//adicionando as classes observadoras 
		c.addObserver(gb);
		c.addObserver(al);
		
		Thread.sleep(2000);
		c.adicionaAcoes("COMP02", 200);
		Thread.sleep(2000);
		c.adicionaAcoes("EMP34", 400);
		Thread.sleep(2000);
		c.adicionaAcoes("ACDF89", 300);
		Thread.sleep(2000);
		c.adicionaAcoes("EMP34", -200);
		Thread.sleep(2000);
		c.adicionaAcoes("COMP02", 150);
	}
}
