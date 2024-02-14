public class ternary {

        public static void main(String[] args) {
            int a = 5, b = 2;
            int c, d;

            c = (a < b) ? a : b; // c will be 2 because a < b is false.
            d = (a > b) ? a : b; // d will be 5 because a > b is true.

            System.out.println("c is " + c); // c is 2
            System.out.println("d is " + d); // d is 5
        }


}
