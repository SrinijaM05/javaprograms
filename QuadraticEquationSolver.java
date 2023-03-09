import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient of x^2: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient of x: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the constant term: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The equation has two real roots: " + x1 + " and " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);

            System.out.println("The equation has one real root: " + x);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scanner.close();
    }
}





