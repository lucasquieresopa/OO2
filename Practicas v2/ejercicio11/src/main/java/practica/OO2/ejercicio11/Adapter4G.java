package practica.OO2.ejercicio11;

public class Adapter4G implements Connection{

	private Connection4G connection4G;
	
	public Adapter4G() {
		this.connection4G = new Connection4G();
	}
	
	public String sendData(String data, long crc) {

		return this.connection4G.transmit(data, crc);
	}


	public String pict() {

		return this.connection4G.symb();
	}
	
}
