package First_package;

import java.util.Scanner;

public class Calclulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four numbers:");

        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

       
        int sum = num1 + num2 + num3 + num4;

       
        System.out.println("Sum of the four numbers is: " + sum);

        scanner.close();
    }
}
