package templateMethod_Bridge;

public class ProcessadorNull implements PosProcessador {
   //padrao null Object
	public byte[] processar(byte[] bytes) {
		
		return bytes;
	}

}
