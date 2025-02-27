import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class findPairs {
    public static void main(String[] args){

        int[] array = {1,2,3,4,4,5,6,7,7,7,8,9};

//        findPairs(array);
        findMode(array);

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

    public static void findMode(int[] arr) {
        HashSet<Integer> modeList = new HashSet<>();
        int maxCount = 0;
        int mode = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    modeList.add(arr[i]);

                    if (count > maxCount) {
                        modeList.clear();
                        modeList.add(arr[i]);
                        maxCount = count;
                        mode = arr[i];
                    }
                }
        }
    }

        System.out.println(modeList);
        System.out.println(mode);
    }

}
