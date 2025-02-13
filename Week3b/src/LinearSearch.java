import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
        public static void main(String[] args){

        //int[] Test = {0,1,2,3,4,5,6,7,8,9,10};

        Random random = new Random();
        int[] arrayRandom = new int[100];
        for(int i = 0; i<arrayRandom.length;i++){
            arrayRandom[i] = random.nextInt(100)+1;
        }

        System.out.println(Arrays.toString(arrayRandom));

        System.out.println(linearSearch(arrayRandom, 95));

    }

    public static int linearSearch(int[] array, int key){
        int comparisons = 0;
        // iterate over each element in array
        for(int i = 0; i < array.length; i++) {
            comparisons++;
            if (key == array[i]) {
                System.out.println("Comparisons: " + comparisons);
                return i; // found it so return position
            }
        }
        System.out.println("Comparisons: " + comparisons);
        return -1; // not found so return -1
    }
}
