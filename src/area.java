import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double area, radius;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius:");
        radius = scan.nextDouble();

        area = Math.PI * radius * radius;

        System.out.printf("Area is %.2f%n", area);
    }
}
