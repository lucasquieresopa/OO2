package practica.OO2.fw_ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class WordHandler extends Handler{

	private Handler hh;
	private List<String> wordsFiltered;
	
	public WordHandler(Handler hh) {
		this.wordsFiltered = new ArrayList<String>();
		this.hh = hh;
	}
	
	public void filterWord(String word) {
		this.wordsFiltered.add(word);
	}
	
	public String filterMessage(String msg) {
		String newMessage = msg;
		for(String w: this.wordsFiltered) {
			newMessage = newMessage.replace(w, "***");
		}
		return newMessage;
	}

	
	@Override
	public void publish(LogRecord record) {
		String filteredMessage = filterMessage(record.getMessage());
		record.setMessage(filteredMessage);
		this.hh.publish(record);
	}

	@Override
	public void flush() {
		this.hh.flush();
		
	}

	@Override
	public void close() throws SecurityException {
		this.hh.close();
		
	}
	
	
	
}
