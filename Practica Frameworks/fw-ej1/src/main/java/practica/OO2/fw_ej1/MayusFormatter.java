package practica.OO2.fw_ej1;


import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class MayusFormatter extends SimpleFormatter{
	

	public String format(LogRecord record) {
		return super.format(record).toUpperCase();
	}
	
}
