package First_package;

import java.util.ArrayList;
import java.util.Collections;

public class get_set_indexof {

	public static void main(String[] args) {
		
			ArrayList a1 =new ArrayList();
			a1.add(12);
			a1.add(30);
			a1.add(100);
			a1.add(-12);
			a1.add(-120);
			a1.add(555);
			
			System.out.println(a1.get(2)); //get
			
			a1.set(0, "vaibhav"); //set
			System.out.println(a1);
			
			System.out.println(a1.indexOf(-12)); //indexof
			
			
		
			System.out.println(a1);

	}

}
