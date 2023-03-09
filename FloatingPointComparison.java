import java.util.Scanner;

public class FloatingPointComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = input.nextDouble();

        // Round the numbers to three decimal places
        num1 = Math.round(num1 * 1000.0) / 1000.0;
        num2 = Math.round(num2 * 1000.0) / 1000.0;

        if (num1 == num2) {
            System.out.println("The two numbers are the same up to three decimal places.");
        } else {
            System.out.println("The two numbers are different.");
        }
    }
}