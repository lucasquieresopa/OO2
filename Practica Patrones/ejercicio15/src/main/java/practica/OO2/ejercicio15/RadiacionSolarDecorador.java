package practica.OO2.ejercicio15;

public class RadiacionSolarDecorador extends InfoDecorador{

	public RadiacionSolarDecorador(EstacionMeteorologica est) {
		super(est);
	}

	public String displayData() {
		return super.displayData() + "Radiacion: " + super.getRadiacionSolar();
	}
}
