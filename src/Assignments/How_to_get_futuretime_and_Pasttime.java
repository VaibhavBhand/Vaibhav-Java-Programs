package Assignments;

import java.util.Date;

public class How_to_get_futuretime_and_Pasttime {

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1.getTime()); //epoch time https://www.epochconverter.com/
		
		Date d2 = new Date (d1.getTime());
		System.out.println(d2); //present time convertered the epoch time to understandable langauage
		
		Date d3 = new Date (d1.getTime()+(60*60*1000*24*1));
		System.out.println(d3); //Future time
		
		Date d4 = new Date (d1.getTime()-(60*60*1000*24*1));
		System.out.println(d4); //Past time
		
		
	}

}
