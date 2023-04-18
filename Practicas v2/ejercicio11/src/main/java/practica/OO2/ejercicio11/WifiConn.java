package practica.OO2.ejercicio11;

public class WifiConn implements Connection{

	private String pict;
	
	public WifiConn(String pict) {
		this.pict = pict;
	}
	
	public String sendData(String data, long crc) {

		return null;
	}


	public String pict() {

		return this.pict;
	}
}
