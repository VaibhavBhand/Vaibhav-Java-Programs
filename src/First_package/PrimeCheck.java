package First_package;



public class PrimeCheck 
{
	
		
		public static void main(String[] args) {
	        int number = 25; // Change this number to check other values
	        boolean isPrime = isPrime(number);

	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
		

	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	        // Handle edge cases
	        if (number <= 1) {
	            return false; // 0 and 1 are not prime numbers
	        }
	        if (number <= 3) {
	            return true; // 2 and 3 are prime numbers
	        }
	        if (number % 2 == 0 || number % 3 == 0) {
	            return false; // Divisible by 2 or 3 is not a prime number
	        }

	        // Check for factors from 5 to the square root of num
	        for (int i = 5; i * i <= number; i += 6) {
	            if (number % i == 0 || number % (i + 2) == 0) {
	                return false;
	            }
	        }

	        return true; // No factors found, so it is a prime number

	}
	}


