//Ch4.26 
   // Exercise 4.26 // Mystery: The program prints alternating < and > symbols in each row. 
   //It iterates from row 10 to 1, printing < if row is odd and > if row is even, 
   //for each of the 10 columns. After each row, it moves to the next line.
   // The pattern changes every row.
 public class Chap4_ex426 {
    public static void main(String[] args) {
    }
}
  class Mystery3 {
      public static void main(String[] args) {
        int row = 10;

         while (row >= 1) {
            int column = 1;
 
            while (column <= 10) {
             System.out.print(row % 2 == 1 ? "<" : ">");
             ++column;
           }

            --row;
           System.out.println();
       }
     }
 }