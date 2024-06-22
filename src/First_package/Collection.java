package First_package;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;

public class Collection 
{

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("RAM"); //for add the parameter is object
		a1.add("Umesh");
		a1.add(12);
		a1.add("67");
		a1.add(true);
		
		
		a1.remove(0); //remove element at the given index position
		a1.remove("67"); //directly removing a specific object
		
		System.out.println(a1);
		
	//	a1.clear(); // clears everything inside the arraylist
		System.out.println("after clearing the a1-->" +a1);
		
		boolean answer1 = a1.isEmpty(); // isEmpty return boolean value true if the Arraylist is empty
		System.out.println(answer1);
		
		
		
		
	ArrayList a2 =new ArrayList(20);
		
		a2.addAll(a1); //for addAll parameter is the collection
		
		a2.add(1, "Vaibhav"); // adding object at the indexing postion 
	
		a2.addAll(0, a1); // add entire collection at the indexing position
	
		System.out.println(a2);
		
		System.out.println("before removing" +a2);
		
	//	a2.removeAll(a1); // remove entire collection
		
	//	System.out.println("after removing" +a2);
		
		ArrayList a3 = new ArrayList();
		a3 = (ArrayList) a2.clone(); // clone will create the replica of the ArrayList
		System.out.println("a3 is the replica of a2" +a3);
		
		
		
		
		
	
	}

}
