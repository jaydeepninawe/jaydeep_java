public class shiftOperator {

        public static void main(String[] args) {
            int value = 10;
            int x = value << 2; // 40
            int y = value >> 2; // 2
            int z = value >>> 2; // 2

            int negValue = -123;
            int z1 = negValue >>> 1; // This number turns positive.

            System.out.println(x); // 40
            System.out.println(y); // 2
            System.out.println(z); // 2
            System.out.println(z1); // 2147486811
        }


}
