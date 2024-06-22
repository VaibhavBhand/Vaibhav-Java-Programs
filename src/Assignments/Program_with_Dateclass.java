package Assignments;

import java.util.Date;

public class Program_with_Dateclass 
{

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1);
		
		String d2 = d1.toString();
		System.out.println(d2);
		
		String month = d2.substring(4, 7);
		System.out.println(month);
		
		String date = d2.substring(8, 10);
		System.out.println(date);
		
		String year = d2.substring(d2.length()-4);
		System.out.println(year);
		
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));

	}

}
