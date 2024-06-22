package string_functions;

public class String_Functions 
{

	public static void main(String[] args) 
	{
		//name.lengh() function
		String name ="Vaibhav";
		String sName = "Bhand";
		int lenght_of_string = name.length();
		System.out.println(lenght_of_string);
		
		//charAt()
		System.out.println(name.charAt(2));
		
		//indexof()
		System.out.println(name.indexOf('i'));
		
		//toUpperCase()
		System.out.println(name.toUpperCase());
		
		//toLowerCase()
		System.out.println(name.toLowerCase());
		
		//concat()
		System.out.println(name.concat(" Bhand"));
		
		//contains -- it is case sensitive
		System.out.println(name.contains("Vai"));
		
		//trim() --- it removes the space from starting and end of the string
		System.out.println(name.trim());
		
		//.equals --- it checks the if two strings are equal to each other
		System.out.println(sName.equals(name));
		
		
		
		
		

	}

}
