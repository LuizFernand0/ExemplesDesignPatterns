package hookMethod;

public abstract class HookMethod {
	
	
	public void  metodoPrincipal(){
		
		//logica do m�todo principal
		metodoGancho();
		metodoGancho2();
		// logica do metodo principal
		return;
	}
	
	public void metodoGancho2(){
	
	}

	public abstract void metodoGancho();

}
