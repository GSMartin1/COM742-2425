import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = binaryToDecimal(binary);

        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }

    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = length - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0'; // Convert char to int
            int power = length - i - 1;
            decimal += bit * Math.pow(2, power);
        }

        return decimal;
    }
}
