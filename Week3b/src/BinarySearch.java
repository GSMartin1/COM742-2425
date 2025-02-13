import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static void main(String[] args){

        //int[] Test = {0,1,2,3,4,5,6,7,8,9,10};

        Random random = new Random();
        int[] arrayRandom = new int[100];
        for(int i = 0; i<arrayRandom.length;i++){
            arrayRandom[i] = random.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(arrayRandom));

        //Needs Sorted First
        Arrays.sort(arrayRandom);
        System.out.println(Arrays.toString(arrayRandom));

        //Search
        System.out.println(binarySearch(arrayRandom, 95));

    }


    public static int binarySearch(int[] array, int key){
        int comparisons = 0;
        int left = 0, right = array.length-1; //left and right values

        while (left <= right) {
            int pivot = (left + right) / 2; //pivot
            if (key == array[pivot]) {
                System.out.println("Comparisons: " + comparisons);
                return pivot;	// found
            } else if (key > array[pivot]) {
                left = pivot + 1; 	// search right
                comparisons++;
            } else {
                right = pivot - 1; 	// search left
                comparisons++;
            }
        }
        System.out.println("Comparisons: " + comparisons);
        return -1; // not found so return -1
    }
}
