import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findPairs {
    public static void main(String[] args){

        int[] array = {1,2,3,4,4,5,6,7,7,8,9};

        findPairs(array);

    }

    public static void findPairs(int[] arr) {
        List<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    pairs.add(arr[i]);
                }
            }
        }
        System.out.println(pairs);
    }

}
