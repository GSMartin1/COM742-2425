import java.util.Scanner;

public class Practical8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        int choice = 0;

        do {
            System.out.println("\nCalculator Application");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = num1 + num2;
                        System.out.print("Result: " + result);
                        break;
                    case 2:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = num1 - num2;
                        System.out.print("Result: " + result);
                        break;
                    case 3:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = num1 * num2;
                        System.out.print("Result: " + result);
                        break;
                    case 4:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.print("Result: " + result);
                        } else {
                            System.out.println("Cannot divide by zero.");
                            continue; // Go back to the menu
                        }
                        break;

                    case 5:
                        System.out.println("Thank you for using the Calculator Application.");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid. Try again.");
            }

        } while(choice!=5);
    }
}

