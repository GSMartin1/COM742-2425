import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int evenSum = calculateEvenSum(n);

        System.out.println("Sum of even numbers between 1 and " + n + ": " + evenSum);

        scanner.close();
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int calculateEvenSum(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (isEven(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
