package First_package;

public class AssertWithForLoop 
{

	public static void main(String[] args)
	{
		int[] numbers = {1, 2, 3, 4, 5, -1};  

   
        for (int i = 0; i < numbers.length; i++) 
        {
            // Assert that each number in the array is positive
            assert numbers[i] > 0 : "Array contains a non-positive number at index " + i + ": " + numbers[i];
        }

        
        System.out.println("All elements in the array are positive.");

	}

}
