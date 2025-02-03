import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CatchingErrors {

    public static void main(String[] args) {
        arithmeticException();
        nullPointerException();
        arrayIndexOutOfBoundsException();
        numberFormatException();

    }

    public static void arithmeticException() {
        try {
            File file = new File("nonexistentfile.txt");
            FileReader fr = new FileReader(file);
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void nullPointerException() {
        String str = null;
        System.out.println(str.length()); // NullPointerException
    }

    public static void arrayIndexOutOfBoundsException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
    }

    public static void numberFormatException() {
        String invalidNumber = "abc";
        int num = Integer.parseInt(invalidNumber); // NumberFormatException
    }



}
