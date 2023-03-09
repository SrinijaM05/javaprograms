//write a java program that takes a year from user and print weather and year is a leap year or not
import java.util.Scanner;

public class LeapYearWeather {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Print out the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Print out a message about the weather
        if (year >= 2023) {
            System.out.println("The weather in " + year + " will be similar to the current weather.");
        } else {
            System.out.println("The weather in " + year + " was similar to the weather in 2022.");
        }
    }
}
Enter a year: 2022
2022 is not a leap year.
The weather in 2022 was similar to the weather in 2022.
