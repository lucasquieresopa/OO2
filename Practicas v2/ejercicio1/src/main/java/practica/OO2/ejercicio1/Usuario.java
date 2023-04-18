package practica.OO2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public void postearTweet(Tweet tweet) {
		tweet.comprobarLongitud();
		this.tweets.add(tweet);
	}
	
	public void retweetear(Tweet tweetOrigen, Tweet retweet) {
		retweet.comprobarLongitud();
		tweetOrigen.retweetear(retweet);
		this.tweets.add(retweet);
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
	
	public void borrarTweet(Tweet tweet) {
		for(Tweet tweet : this.getTweets()) {
			tweet.borrarTweet(tweet);
		}
	}
	
	
}
