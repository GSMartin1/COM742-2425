import java.util.Arrays;
import java.util.Random;

public class BruteForce {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for(int i = 0; i< array.length; i++){
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int Max = findMax(array);
        System.out.println(Max);

    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
        }
        return max;

    }
}