public class smallest {

        public static void main(String[] args) {
            int num1 = 10, num2 = 20, num3 = 5, num4 = 15;
            int smallest = num1;

            if (num2 < smallest) {
                smallest = num2;
            }
            if (num3 < smallest) {
                smallest = num3;
            }
            if (num4 < smallest) {
                smallest = num4;
            }

            System.out.println("The smallest number is: " + smallest);
        }

}
