//write java program to reads number from the user and print whether is positive or negative 
import java.util.Scanner;

public class positivenegative {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is zero.");
    }
    input.close();
  }
}
Enter a number: 5
The number is positive.
