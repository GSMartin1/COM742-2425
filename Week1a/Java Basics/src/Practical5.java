import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for A:");
        int a = scanner.nextInt();
        System.out.println("Enter a value for B:");
        int b = scanner.nextInt();

        System.out.println("Sum: " + add(a,b));
        System.out.println("Difference: " + subtract(a,b));
        System.out.println("Product: " + multiply(a,b));
        System.out.println("Quotient: " + divide(a,b));
    }
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {return a * b;}
    static int divide(int a, int b) {return a / b;}

}
