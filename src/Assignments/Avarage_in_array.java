package Assignments;

public class Avarage_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Define the input array
	        int numbers[] = {1, 2, 3, 4, 5};
	        
	        // Variable to store the sum of the elements
	        int sum = 0;
	        
	        // Loop through the array and sum the elements
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	        
	        // Calculate the average
	        double average = (double) sum / numbers.length;
	        
	        // Print the average
	        System.out.println("Average: " + average);
	    }
	

	}


