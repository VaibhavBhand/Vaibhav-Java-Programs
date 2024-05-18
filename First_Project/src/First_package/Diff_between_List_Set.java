package First_package;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Diff_between_List_Set {

	public static void main(String[] args) {
	
		System.out.println("Lets understand everything about list");		
		List a1 = new ArrayList();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("School");
		a1.add("Collage");
		System.out.println(a1); // list follows the indexing
		
		a1.add("Collage");
		a1.add(null); // null values are accepted in List
		a1.add(null);
		a1.add(null);
		System.out.println(a1); // list can allow duplicate values
		
		
						Iterator i1 =a1.iterator();     // iterator concept in List
							while(i1.hasNext())
							{
								System.out.println(i1.next());
							}
		
				
		
		System.out.println("Lets understand everything about Set");		
		Set a2 = new HashSet();
		a2.add("Pen");
		a2.add("Pencil");
		a2.add("School");
		a2.add("Collage");
		System.out.println(a2); // set don't follow indexing rather they follow hashcode value
		
		a2.add("Collage");
		
		System.out.println(a2); // Set does not allow duplicate values
		a2.add(null); // multiple null values are not allowed in set, only one is allowed
		a2.add(null);
		a2.add(null);
		System.out.println(a2);
		
		Iterator i2 =a2.iterator();       //Iterator concept in set
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}

	}

}
