import java.util.Scanner;

public class Practical9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shape Calculator");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateSquare();
                break;
            case 2:
                calculateRectangle();
                break;
            case 3:
                calculateTriangle();
                break;
            case 4:
                calculateCircle();
                break;
            case 5:
                System.out.println("Thank you for using the Shapes Application.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    static void calculateSquare() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Square Area: " + area);
        System.out.println("Square Perimeter: " + perimeter);
    }

    static void calculateRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }

    static void calculateTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Triangle Area: " + area);
    }

    static void calculateCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + perimeter);
    }
}
