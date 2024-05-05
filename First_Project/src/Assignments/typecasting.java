package Assignments;

public class typecasting {

	public static void main(String[] args) 
	{
		double a = 90; //implicitly
		System.out.println(a); 
		int age =90; //implicitly
		double ageofperson =  age;
		System.out.println(ageofperson);
		
		
		double ageofperson1 =(double) age; //explicitly
		System.out.println(ageofperson1);
		
		
		double pi=3.14;
		int piv=    (int)pi;
		
		
	}

}
