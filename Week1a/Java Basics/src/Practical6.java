import java.util.Scanner;

public class Practical6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Reverse: " + stringBuilder.reverse());
        System.out.println("Contains '@': " + name.contains("@"));

        scanner.close();
    }
}
