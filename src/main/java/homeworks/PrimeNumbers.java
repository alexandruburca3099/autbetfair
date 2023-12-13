package homeworks;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Display prime numbers lower than 1,000,000
        for (int i = 2; i < 1000000; i++) {
            boolean isPrime = true;

            // Check if i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
