package string_functions;

public class Remove_Or_Replace_specific_Leter_from_string 
{

	public static void main(String[] args) 
	{
		String input ="school123";
		
		String output = input.replace('o', ' '); //replace 'o' with blank space
		System.out.println(output);
		
		String output1 = input.replace('o', 'M');//replace 'o' with 'M'
		System.out.println(output1);
		
		String output2 = input.replaceAll("[a-z]", "");//replace all alphabets with blank space
		System.out.println(output2);
		
		String input2 ="SCHool123";
		
		String output3 = input2.replaceAll("[A-Za-z]", "");//replace all capital alphabets with black space
		System.out.println(output3);
		
		String output4 = input2.replaceAll("[0-9]", "");//replace all numeric values with black space
		System.out.println(output4);
		

	}

}
