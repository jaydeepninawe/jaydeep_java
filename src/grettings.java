import java.util.Scanner;
public class grettings {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String name = scan.nextLine();

        System.out.println("Hello ! " + name);
    }
}
}
