import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] data = ReadAndWrite.readNumbers("100Search.txt");
//        int key = 95;

        int[] data = {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};

        System.out.println(Arrays.toString(data));

        int positionL = LinearSearch.linearSearch(data, 17);

        System.out.println("Position of Key: " + 17 + " is position " + positionL );

        Arrays.sort(data);

        int positionB = BinarySearch.binarySearch(data, 17);

        System.out.println("Position of Key: " + 17 + " is position " + positionB );

    }
}