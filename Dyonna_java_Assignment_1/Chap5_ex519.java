

public class Chap5_ex519 {
    public static void main(String[] args) {

//assume that:
int i = 1, j = 2, k = 3, m = 2;
//What does each of the following statements print?
System.out.println(i == 1); //true
System.out.println(j == 3);//false
System.out.println((i >= 1) && (j < 4));//true
System.out.println((m <= 99) & (k < m));//false   // true & false .. results to false
System.out.println((j >= i) || (k == m));//true // because of OR operator the second parentheses is not evaluated
System.out.println((k + m < j) | (3 - j >= k));//true
System.out.println(!(k > m));//false // k is greater than m but the not operator(!) makes it false
}
}