import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Square");
        System.out.println("2. Right Angled Triangle");
        System.out.println("3. Pyramid");
        System.out.print("Enter your choice (1 or 2 or 3): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            printSquare();
        } else if (choice == 2) {
            printTriangle();
        } else if (choice == 3) {
            printPyramid();
        }else {
            System.out.println("Invalid Choice!");
        }
    }

    public static void printSquare() {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramid(){
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
