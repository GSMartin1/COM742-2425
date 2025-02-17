import java.util.Arrays;
import java.util.Random;

public class Q1 {
    public static void main(String[] args){
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        int[] arrayNums = new int[100];

        for (int i = 0; i< arrayNums.length; i++){
            arrayNums[i] = rand.nextInt(100) + 1;
//            arrayNums[i] = i;
        }

        for (int i = 0; i< arrayNums.length; i++){
            System.out.print(arrayNums[i] + " ");
        }
        System.out.println(" ");

//        System.out.println("Min: " + findMin(arrayNums));
//        System.out.println("Max: " + findMax(arrayNums));
//
//        System.out.println("Min sort: " + findMinSort(arrayNums));
//        System.out.println("Max sort: " + findMaxSort(arrayNums));

        System.out.println("Duplicates: " + findDuplicates(arrayNums));
        System.out.println("Duplicates Nested: " + findDuplicatesNestedLoop(arrayNums));

    }

    public static int findMin(int[] arrayNums){
        int lowest = arrayNums[0];

        for(int i = 0; i< arrayNums.length; i++){
            if(arrayNums[i]< lowest){
                lowest = arrayNums[i];
            }
        }
        return lowest;
    }
    public static int findMax(int[] arrayNums){
        int highest = arrayNums[0];

        for(int i = 0; i< arrayNums.length; i++){
            if(arrayNums[i]> highest){
                highest = arrayNums[i];
            }
        }
        return highest;
    }
    public static int findMinSort(int[] arrayNums){
        Arrays.sort(arrayNums);
        return arrayNums[0];
    }
    public static int findMaxSort(int[] arrayNums){
        Arrays.sort(arrayNums);
        return arrayNums[arrayNums.length-1];
    }

    //Q2 Duplicates
    public static int findDuplicates(int[] arrayNums) {
        int duplicates = 0;
        Arrays.sort(arrayNums);

        for (int i = 0; i < arrayNums.length - 1; i++) {
//            if (arrayNums[i + 1] - arrayNums[i] == 0) {
            if(arrayNums[i] == arrayNums[i+1]){
                duplicates++;
            }
        }
        System.out.print(Arrays.toString(arrayNums));
        System.out.println(" ");
        return duplicates;
    }

    //Q2 Duplicates
    public static int findDuplicatesNestedLoop(int[] arrayNums) {
//        int duplicates = arrayNums[0];
        int duplicates = 0;
        boolean[] visited = new boolean[arrayNums.length];

        for (int i = 0; i < arrayNums.length - 1; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i+1; j < arrayNums.length - 1; j++) {
                if (arrayNums[i] == arrayNums[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1) {
                duplicates += (count - 1); // Add only duplicate occurrences
            }
        }
        return duplicates;
    }
}
