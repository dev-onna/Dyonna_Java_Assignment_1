public class Chap4_ex434 {
    public static void main(String[] args) {
    }
}
class MultiplesOfTwoInfiniteLoop {
    public static void main(String[] args) {
        int multiple = 2;

        while (true) {
            System.out.println(multiple);
            multiple *= 2; // will continue to print multiples of 2 until stopped manually!! 
        } //Infinetely!! 
    }
}
