import java.util.Scanner;

public class Question1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many rows do you want to print?");

        int numRows = scan.nextInt();
        System.out.println("How many columns do you want to print?");
        int numCols = scan.nextInt();
        System.out.println("What character do you want to print?");
        char sign = scan.next().charAt(0);
        int[][] array = new int[numRows][numCols];
        print2dArray(array, sign);

        scan.close(); // close scanner
    }

    public static void print2dArray(int[][] a, char sign) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[0].length; c++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
}
