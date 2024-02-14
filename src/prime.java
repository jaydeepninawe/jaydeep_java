import java.util.Scanner;
public class prime {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter n:");
            int n = scan.nextInt();
            int count = 0;
            int i = 1;

            while (i <= n) {
                if (n % i == 0) {
                    count++;
                }
                i++;
            }

            if (count == 2) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
    }

}
