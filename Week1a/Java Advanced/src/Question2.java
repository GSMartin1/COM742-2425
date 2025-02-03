import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        boolean isPrime = isPrimeNumber(num);

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i<= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }

        return true; // If no divisors found, it's prime
    }
}
