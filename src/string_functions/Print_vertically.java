package string_functions;

public class Print_vertically {
	
	static void reverse_verticle_string()
	{
		String a ="Vaibhav";
		
		for(int i=a.length()-1; i>=0; i--)
		{
		char a1 = a.charAt(i);
		System.out.println(a1);
		}
	}

	public static void main(String[] args) {
		
		String a ="Vaibhav";
		
		for(int i=0; i<a.length(); i++)
		{
		char a1 = a.charAt(i);
		System.out.print(a1);
		}
		
		System.out.println("========================");
		reverse_verticle_string();
		
		
		
		
		
	}

}
