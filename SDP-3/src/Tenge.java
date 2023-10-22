import java.util.Scanner;

public class Tenge {
    Scanner scanner = new Scanner(System.in);
    public void convertToEuro() {
        System.out.print("Enter how many KZT do you have: ");
        float KZT = scanner.nextInt();
        float USD = KZT/450;
        System.out.println("You got "+USD+" USD");
    }
}
