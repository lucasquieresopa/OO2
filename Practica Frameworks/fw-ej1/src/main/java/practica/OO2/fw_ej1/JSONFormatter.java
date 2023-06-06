package practica.OO2.fw_ej1;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter{

	public String format(LogRecord record) {
		
		return "{ 'message:': " + 
				record.getMessage() + 
				", level: " + 
				record.getLevel() + 
				"} \n";
	}
}
