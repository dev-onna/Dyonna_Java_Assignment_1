//excersize 2.24/Ch2 
// enter 5 integers, print smallest and largest integers

import java.util.Scanner;

public class Chap2_ex224 {
    public static void main(String[] args) {
        // Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();
        System.out.print("Enter the forth integer: ");
        int num4 = input.nextInt();
        System.out.print("Enter the Fifth integer: ");
        int num5 = input.nextInt();

        int smallest = num1;
        int largest = num1;


        if (num2 < smallest) {
            smallest = num2;
        } else if (num2 > largest) {
            largest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        } else if (num3 > largest) {
            largest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        } else if (num4 > largest) {
            largest = num4;
        }
        if (num5 < smallest) {
            smallest = num5;
        } else if (num5 > largest) {
            largest = num5;
        }
       
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    
        input.close();
    }
}