package string_functions;

public class SpecialCharacterCount {
	
		
	
	public static void main(String[] args) {
		
		    
		        String input = "Hello world @@@!!!67788";
		        int specialCharCount = countSpecialCharacters(input);
		        System.out.println("Number of special characters: " + specialCharCount);
		    }

		    public static int countSpecialCharacters(String str) {
		        int count = 0;
		        for (int i = 0; i < str.length(); i++) 
		        {
		            char ch = str.charAt(i);
		            if (!Character.isLetterOrDigit(ch)) 
		            {
		                count++;
		            }
		        }
		        return count;
		    
		

	}

}
