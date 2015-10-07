package proxy_decorator;
/**
 * O objetivo é sempre que haver a necessidade de uma nova transacao 
 * deixar disponivel uma nova Thread para execultar e deixar o programa mais flexivel
 * @author Fernando
 *
 */
public class ProxyAssincrono implements Transacao {

	private Transacao tran;

	//construtor
	public ProxyAssincrono(Transacao tran){
		this.tran = tran;
	}
	
	@Override
	public void executar() {
		
		Runnable run = new Runnable() {			
			@Override
			public void run() {
				tran.executar();
			}
		};
		Thread tread = new Thread(run);
		tread.start();
	}

}
