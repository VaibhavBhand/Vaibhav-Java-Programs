package array_programs;

public class Array_studentnames {

	public static void main(String[] args) 
	{
		String names[] = new String[4]; //declare and initialize the array
		
		names[0]="vaibhav";
		names[1]="vivek";
		names[2] ="mummy";
		names[3] = "pappa";
		
		int []  rollno= new int [4];
		rollno[0]=17;
		rollno[1]= 33;
		rollno[2]=55;
		rollno[3]=66;
		
		char [] gender = new char [4];
		gender[0]= 'M';
		gender[1]= 'M';
		gender[2]= 'F';
		gender[3]= 'M';
		
		
		System.out.println("StudentName"+ "     " + "RollNo" + "    " + "Gender");
		for(int i =0; i<4;i++)
		{
			System.out.println(names[i] +"              " + rollno[i]+"         "+ gender[i]);
		}

	}

}
