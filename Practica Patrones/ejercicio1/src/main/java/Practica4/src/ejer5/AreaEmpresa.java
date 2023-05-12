package ejer5;

public class AreaEmpresa {

	private int retardo;
	private String identificacion = "nombre_empresa";
	
	public AreaEmpresa(int r) {
		this.retardo = r;
	}
	public int getRetardo() {
		return retardo;
	}
	public void setRetardo(int retardo) {
		this.retardo = retardo;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
}
