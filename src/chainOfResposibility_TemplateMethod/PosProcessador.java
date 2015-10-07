package chainOfResposibility_TemplateMethod;

public abstract class PosProcessador {
	PosProcessador proximo;

	public PosProcessador(PosProcessador proximo) {
		this.proximo = proximo;
	}

	public PosProcessador() {
		// deve criar um Null Object
		proximo = new PosProcessadorNulo();
	}

	public byte[] processarCadeia(byte[] bytes) {
		bytes = processar(bytes);
		return proximo.processarCadeia(bytes);
	}

	protected abstract byte[] processar(byte[] bytes);
}
