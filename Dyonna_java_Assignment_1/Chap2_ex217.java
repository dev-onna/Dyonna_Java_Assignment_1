//exercise 2.17/Ch2 // user enters interger, 
//prints sum, average, product, smallest and largest integers

import java.util.Scanner;

public class Chap2_ex217 { 
    public static void main(String[] args) {
        // Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // user asked to enter integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        int smallest = num1;
        int largest = num1;

        // if num2  is smallest than num1, 
        //its smallest, 
        //if num2 is greater than num1. its largest.
        if (num2 < smallest) {
            smallest = num2;
        } else if (num2 > largest) {
            largest = num2;
        }
        // if num2  is smallest than num1, 
        //its smallest, 
        //if num2 is greater than num1. its largest.
        if (num3 < smallest) {
            smallest = num3;
        } else if (num3 > largest) {
            largest = num3;
        }

        int Sum = num1 + num2 + num3; // calculating sum
        double average = Sum / 3.0; // finding average
        int product = num1 * num2 * num3;  //multiplying integers

        // Display results
        System.out.println("Sum: " + Sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        input.close();
    }
}