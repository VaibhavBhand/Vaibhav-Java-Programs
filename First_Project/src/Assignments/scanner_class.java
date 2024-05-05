package Assignments;

import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
				int num1 = s1.nextInt();
				int num2 = s1.nextInt();
				int sum = num1+num2;
				int sub = num1-num2;
				int mul = num1*num2;
				int div = num1/num2;
				int mod = num1%num2;
				
				
				System.out.println("The Sum of given input " + sum );
				System.out.println("The substraction of given input " + sub );
				System.out.println("The Multiplication of given input " + mul );
				System.out.println("The divison of given input " + div );
				System.out.println("The modulus of given input " + mod );
				s1.close();
			
	}

}
