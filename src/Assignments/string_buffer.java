package Assignments;
import java.lang.*;

public class string_buffer {

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer ("Automation");//mutable
		s1 =s1.append(" Testing");
		System.out.println(s1);
		
		String s2 ="Manual";//immutable
		s2 =s2.concat(" Testing");
		System.out.println(s2);

	}

}
