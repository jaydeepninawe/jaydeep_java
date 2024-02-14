import java.util.Scanner;
public class score_card {
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the score: ");
            int score = scanner.nextInt();
            char grade;

            if (score >= 0 && score <= 50) {
                grade = 'D';
            } else if (score <= 60) {
                grade = 'C';
            } else if (score <= 80) {
                grade = 'B';
            } else if (score <= 100) {
                grade = 'A';
            } else {
                System.out.println("Invalid Score");
                return;
            }

            System.out.println("Grade: " + grade);


    }

}
