package WebDriverEx;

import java.util.Calendar;

public class Calaender {
	public static void main(String[] args) {
		
	
	 Calendar cal = Calendar.getInstance();
	 int day = cal.get(Calendar.DATE);
	 int month = cal.get(Calendar.MONTH) + 1;
	 int year = cal.get(Calendar.YEAR);
	 int dow = cal.get(Calendar.DAY_OF_WEEK);
	 int dom = cal.get(Calendar.DAY_OF_MONTH);
	 int doy = cal.get(Calendar.DAY_OF_YEAR);
	 int hr = cal.get(Calendar.HOUR);
	 int mn = cal.get(Calendar.MINUTE);
	 int sec = cal.get(Calendar.SECOND); 
	 int ms = cal.get(Calendar.MILLISECOND);
	 System.out.println(cal.getTimeInMillis());
	 System.out.println("Current Date: " + cal.getTime());
	 
	 System.out.println("Day: " + day);
	 System.out.println("Month: " + month); 
	 System.out.println("Year: " + year);
	 System.out.println("Day of Week: " + dow);
	 System.out.println("Day of Month: " + dom);
	 System.out.println("Day of Year: " + doy);

}

}