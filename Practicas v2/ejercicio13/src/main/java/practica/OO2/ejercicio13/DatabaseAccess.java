package practica.OO2.ejercicio13;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {

	public Collection<String> getSearchResults(String queryString, Usuario user);

	public int insertNewRow(List<String> rowData, Usuario user);


}
