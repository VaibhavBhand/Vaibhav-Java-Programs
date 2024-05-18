package First_package;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class List_Of_Iterator {

	public static void main(String[] args) 
	{
		
		System.out.println("Lets understand everything about list");		
		List a1 = new ArrayList();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("School");
		a1.add("Collage");
		System.out.println(a1); 
		
							ListIterator i1 = a1.listIterator();
								while(i1.hasNext())
								{
									System.out.println(i1.next());
								}
								
								System.out.println("================================================");
								
								while(i1.hasPrevious())
								{
									System.out.println(i1.previous());
								}
							
							
		
		

	}

}
