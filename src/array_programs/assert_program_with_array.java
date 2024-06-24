package array_programs;

import java.util.Arrays;

public class assert_program_with_array
{

	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,9};

        // Perform some checks using assertions
        assert numbers.length == 5 : "Array length should be 5";

        
        System.out.println(Arrays.toString(numbers));
    }

}
