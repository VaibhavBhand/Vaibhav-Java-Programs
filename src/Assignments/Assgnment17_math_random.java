package Assignments;

public class Assgnment17_math_random 
{

	
		public static void main(String[] args) 
		{
	       for (int i =1 ; i<=10; i++)
	       {
	    	  double radius = Math.random() * 10;
	    	  double area =  radius * radius * Math.PI;
	    	  
	    	  System.out.println("Radius= " + i + " || Area " + area );

	       }

}
		}
