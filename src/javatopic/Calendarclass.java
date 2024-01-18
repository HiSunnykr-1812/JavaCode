package javatopic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendarclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal= Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}

}
