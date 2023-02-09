
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();
        // Calculate the sum of the two integers
        int sum = firstNumber + secondNumber;
        // Make sure the sum is non-negative
        if (sum < 0) {
            System.out.println("The sum is negative. Cannot calculate the square root.");
        } else {
            // Calculate the square root of the sum
            double squareRoot = Math.sqrt(sum);
            System.out.println("The square root of the sum is: " + squareRoot);
        }
    }
}