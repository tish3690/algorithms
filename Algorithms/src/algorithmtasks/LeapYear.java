package algorithmtasks;

import java.util.Calendar;

public class LeapYear {
	
	public static boolean isLeapYear(int year){
		
	       Calendar cal = Calendar.getInstance(); //gets Calendar based on local timezone and local
	       cal.set(Calendar.YEAR, year); //setting the calendar year
	       int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
	      
	       if(noOfDays > 365){
	           return true;
	       }
	      
	       return false;
	   }

	public static boolean isLeapYear2(int year){
	       return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
	   }

	
	public static void main(String[] args) {
		
		System.out.println(isLeapYear(1700));
		System.out.println(isLeapYear(1996));
		System.out.println(isLeapYear2(1999));
		System.out.println(isLeapYear2(1996));
		
	}

}
