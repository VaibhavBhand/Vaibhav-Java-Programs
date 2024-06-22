package Assignments;

import java.util.Date;

public class How_to_get_PresentTime {

	public static void main(String[] args) 
	{
		Date d1 = new Date(); // present time
		
		String input = d1.toString();//convert the time to string
		
		System.out.println(input);
		
		
	String month =	input.substring(4, 7);
		System.out.println(month);
		
		String date =	input.substring(8, 11);
		System.out.println(date);
		
		String year =	input.substring(24);
		System.out.println(year);
		
	System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
	
	System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		
		
		
		

	}

}
