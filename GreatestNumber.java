//wirte a java program take three numbers from the user and print the greatest number
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }
System.out.println("the greatest number is:"+greatest);
}
}
Enter the first number: 83
Enter the second number: 85
Enter the third number: 949
the greatest number is:949
