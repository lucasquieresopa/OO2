package practica.OO2.ejercicio11;

public class Dispositivo {

	private CRC_Calculator crcCalculator;
	private Ringer ringer;
	private Connection connection;
	private Display display;
	
	public Dispositivo(CRC_Calculator crc_calc, Ringer ringer,
			Connection connection, Display display) {
		this.crcCalculator = crc_calc;
		this.ringer = ringer;
		this.connection = connection;
		this.display = display;
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public void configurarCRC(CRC_Calculator newCRC_calc) {
		this.crcCalculator = newCRC_calc;
	}
	
	public void conectarCon(Connection newConn) {
		this.connection = newConn;
		this.display.showBanner(newConn.pict());
		this.ringer.ring();
	}
}
