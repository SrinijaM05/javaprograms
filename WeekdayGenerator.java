//write a java program that keeps a number from the user and generates an integer between one and seven and displace the name of the week day
import java.util.Scanner;

public class WeekdayGenerator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = input.nextInt();
      int day = (int) (Math.random() * 7) + 1;
      String weekday;
      switch (day) {
         case 1:
            weekday = "Sunday";
            break;
         case 2:
            weekday = "Monday";
            break;
         case 3:
            weekday = "Tuesday";
            break;
         case 4:
            weekday = "Wednesday";
            break;
         case 5:
            weekday = "Thursday";
            break;
         case 6:
            weekday = "Friday";
            break;
         case 7:
            weekday = "Saturday";
            break;
         default:
            weekday = "Invalid day";
            break;
      }
      System.out.println("The corresponding weekday for the number " + num + " is " + weekday);
   }
}
Enter a number: 45
The corresponding weekday for the number 45 is Wednesday
