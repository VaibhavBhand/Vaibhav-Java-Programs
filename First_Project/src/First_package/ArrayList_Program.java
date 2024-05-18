package First_package;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Program 
{

	public static void main(String[] args) 
	{
		
		ArrayList a1 = new ArrayList();
		a1.add("RAM"); //for add the parameter is object
		a1.add("Umesh");
		a1.add(12);
		a1.add("67");
		a1.add(true);
		a1.add("98");
		System.out.println(a1.size()); // size 
		
		System.out.println(a1.contains("Sita")); //contains
		
		System.out.println(a1);
		
		
		Iterator i1 = a1.iterator();
		
		//hasnext method
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
