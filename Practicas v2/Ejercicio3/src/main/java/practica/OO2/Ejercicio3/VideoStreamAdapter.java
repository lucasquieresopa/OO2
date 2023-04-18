package practica.OO2.Ejercicio3;

public class VideoStreamAdapter extends Media{

	private VideoStream adaptee;
	
	public void play() {
		this.adaptee.reproduce();
	}
}
