package practica.OO2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario agregarUsuario(String screenName) {
		validarScreenName(screenName); 
		Usuario nuevoUsuario = new Usuario(screenName);
		this.usuarios.add(nuevoUsuario);
		return nuevoUsuario;
	}
	
	public boolean validarScreenName(String screenName) {
		if(this.usuarios.stream()
				.anyMatch(usuario -> usuario.getScreenName().equals(screenName))) {
			return true;
		}
		else {
			//excepcion;
		}
	}
	
	public void borrarUsuario(Usuario usuario) {
		this.usuarios.remove(usuario);
		for (Tweet tweet : usuario.getTweets()) {
			this.usuarios.stream()
				.forEach(u -> u.borrarTweet(tweet));
		}
		
	}
	
}


/*CONSULTAS





*/
