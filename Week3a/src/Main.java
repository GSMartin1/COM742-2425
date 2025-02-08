import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayRandom = new int[100];
        for(int i = 0; i<arrayRandom.length;i++) {
            arrayRandom[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(arrayRandom));

        arrayRandom = Sort.insertionSort(arrayRandom);
        System.out.println(Arrays.toString(arrayRandom));


    }
}