import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double volume;

        if (choice == 1) {
            System.out.print("Enter the radius of the sphere: ");
            double radius = scanner.nextDouble();
            volume = calculateSphereVolume(radius);
            System.out.println("Volume of the sphere: " + volume);
        } else if (choice == 2) {
            System.out.print("Enter the radius of the cylinder: ");
            double radius = scanner.nextDouble();
            System.out.print("Enter the height of the cylinder: ");
            double height = scanner.nextDouble();
            volume = calculateCylinderVolume(radius, height);
            System.out.println("Volume of the cylinder: " + volume);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    static double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
