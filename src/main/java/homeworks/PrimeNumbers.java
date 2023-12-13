package homeworks;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Display prime numbers lower than 1,000,000
        for (int i = 2; i < 1000000; i++) {
            if (numberIsPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean numberIsPrime(int number){
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible, the number is not prime
            }
        }

        return true; // If not divisible by any number, the number is prime
    }
}
