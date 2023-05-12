package ar.edu.unlp.info.oo2.biblioteca;

	import java.util.List;
	
	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;

public class Exporter extends VoorheesExporter{

	public String exportar(List<Socio> socios) {
		JSONArray arrayDeSocios = new JSONArray();
		for (Socio socio : socios) {
			JSONObject socioJson = new JSONObject();
			socioJson.put("nombre", socio.getNombre());
			socioJson.put("email", socio.getEmail());
			socioJson.put("legajo", socio.getLegajo());
			arrayDeSocios.add(socioJson);
		}
		
		return arrayDeSocios.toJSONString();
	}
}
