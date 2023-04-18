package practica.OO2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

import Practica4.src.ejercicio3.ArbolGeneral;
import Practica4.src.ejercicio3.ListaGenerica;

public class Tweet {

	private String texto;
	public List<Tweet> retweets;
	public Tweet tweetOrigen;
	
	public Tweet(String texto) {
		this.texto = texto;
		this.retweets = new ArrayList<Tweet>();
		this.tweetOrigen = null;
	}
	
	public boolean comprobarLongitud() {
		if((this.texto.length() > 0) && (this.texto.length() <= 280)){
			return true;
		}
		else {
			//excepcion;
		}
	}
	
	public void retweetear(Tweet tweet) {
		this.retweets.add(tweet);
		tweet.setTweetOrigen(this);
	}
	
	private void setTweetOrigen(Tweet tweetOrigen) {
		this.tweetOrigen = tweetOrigen;
	}
	
	public List<Tweet> getRetweets(){
		return this.retweets;
	}
	
	public void borrarTweet(Tweet tweet) {
		List<Tweets> retweets = this.retweets;
		if(!this.retweets.isEmpty()) {
			this.retweets.stream().forEach(rt -> rt.borrarTweet(tweet));
		}
		
	}
	

	
	public void borrarTweets(List<Tweet> tweetsABorrar) {
		
		if(retweet.getRetweets().isEmpty() && tweetsABorrar.stream()
												.anyMatch(tweet -> tweet.equals(retweet))) {
			this.retweets.remove(retweet);
		}
		else {
			retweet.borrarTweets(tweetsABorrar)
		}
		
		/*
		mientras tiene retweets: tomar retweets
		si las lista de retweets está vacia y == a un tweet de la lista a borrar: remove(retweet)
		si está vacia y no es igual -> nada
		
		
		 */
		
		
		
		if(this.retweets.isEmpty()) {
			
		}
		else {
			this.retweets.stream()
				.forEach(tweet -> tweet.borrarTweets(tweetsABorrar));
		}
		
	}
	
	
}
