package practica.OO2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> disposicion;
	
	public Mixta(Topografia EsquinaSI, Topografia EsquinaSD, 
			Topografia EsquinaII, Topografia EsquinaID) {
		this.disposicion = new ArrayList<Topografia>();
		this.disposicion.add(EsquinaSI);
		this.disposicion.add(EsquinaSD);
		this.disposicion.add(EsquinaII);
		this.disposicion.add(EsquinaID);
	}
	
	public Mixta(Agua proporcionDeAgua, Tierra proporcionDeTierra) {
		this.disposicion = new ArrayList<Topografia>();
		this.disposicion.add(proporcionDeAgua);
		this.disposicion.add(proporcionDeTierra);
	}

	public double proporcionDeAgua() {
		//mejorar con stream
		return (this.disposicion.get(0).proporcionDeAgua() + this.disposicion.get(1).proporcionDeAgua() + 
				this.disposicion.get(2).proporcionDeAgua() + this.disposicion.get(3).proporcionDeAgua()) / 4;
	}

	public List<Topografia> disposicion(){
		return this.disposicion;
	}
	
}
