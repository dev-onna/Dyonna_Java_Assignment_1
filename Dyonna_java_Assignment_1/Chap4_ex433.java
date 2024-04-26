

public class Chap4_ex433 {
    public static void main(String[] args) {
    }
}
class Checkerboard {
    public static void main(String[] args) {
        // Iterate over rows
        for (int row = 1; row <= 8; row++) {
            
            for (int column = 1; column <= 8; column++) {
                
                if ((row + column) % 2 == 0) { // Check if the sum of row and column is even or odd
                   
                    System.out.print("* "); // If even, print an asterisk
                } else {
                    
                    System.out.print("  "); // If odd, print a space
                }
            }
            System.out.println();// Move to the next row
        }
    }
}
