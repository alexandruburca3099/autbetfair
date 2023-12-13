package homeworks;
import java.util.Scanner;

public class FebruaryDays {
    public static void main(String[] args) {
        // open scanner
        Scanner scanner = new Scanner(System.in);

        // Read the year from the user
        System.out.print("Enter a year (between 1900 and 2016): ");
        int year = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the year is between 1900 and 2016
        if (year >= 1900 && year <= 2016) {
            // Check if the year is a leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            // Determine the number of days in February
            int daysInFebruary = isLeapYear ? 29 : 28;

            // Display the result
            System.out.println("In " + year + ", February has " + daysInFebruary + " days.");
        } else {
            System.out.println("Please enter a year between 1900 and 2016.");
        }
    }
}
