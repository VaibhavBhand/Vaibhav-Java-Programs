package First_package;

import java.util.Scanner;

public class VotingEligibility {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Are you female? (true/false):");
        boolean isFemale = scanner.nextBoolean();

        // Check if the person is above 18 years old and female
        if (age > 18 && isFemale) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}