//write a java program to input five numbers from keyboard and find the sum and average
import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter five numbers:");

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            sum += num;
        }

        average = (double) sum / 5;

        System.out.println("The sum of the five numbers is: " + sum);
        System.out.println("The average of the five numbers is: " + average);
    }
}
Please enter five numbers:
12345
