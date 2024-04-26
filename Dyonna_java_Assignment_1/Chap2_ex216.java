//exercise(2.16)Ch2 //Comparing integers

import java.util.Scanner;

public class Chap2_ex216 {
    public static void main(String[] args) {
        // Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // user asked to enter integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Compare and print the results
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger");
        } else if (num1 == num2) {
            System.out.println("These numbers are equal");
        }

        
        scanner.close();
    }
}
