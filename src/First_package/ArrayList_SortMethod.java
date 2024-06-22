package First_package;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SortMethod {

	public static void main(String[] args) {
		ArrayList a1 =new ArrayList();
		a1.add(12);
		a1.add(30);
		a1.add(100);
		a1.add(-12);
		a1.add(-120);
		a1.add(555);
		
		Collections.sort(a1); //sort using int
		System.out.println(a1);
		
		ArrayList a2 =new ArrayList();
		a2.add("Vaibhav");
		a2.add("Vicky");
		a2.add("Padmavati");
		a2.add("Vishwanath");
		a2.add("Shivani");
		a2.add("Lucky");
		
		Collections.sort(a2); //Sort using string
		System.out.println(a2);
	
	}

}
