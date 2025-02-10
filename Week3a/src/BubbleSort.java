import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int [] numbers = {2,5,9,3,13,1,16,7,8,15,4,6};
        int [] numbersCopy = {2,5,9,3,13,1,16,7,8,15,4,6};

        System.out.println(Arrays.toString(numbers));

        bubbleSort(numbers);
        bubbleSortOptomised(numbersCopy);

    }

    public static void bubbleSort(int[] data) {
        int swapBS = 0, comparisonBS = 0;
        for (int out = data.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                comparisonBS++;
                if (data[in] > data[in + 1]) {
                    int tmp = data[in];        // swap items
                    data[in] = data[in + 1];    //
                    data[in + 1] = tmp;        //
                    swapBS++;
                }
            }
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i] + " ");
            System.out.println();
        }
        System.out.println("swapsBS=" + swapBS);
        System.out.println("ComparisonsBS= " + comparisonBS);
    }

    public static void bubbleSortOptomised(int[] data) {
        int swapBS1 = 0, comparisonBS1 = 0;
        boolean swapped = true;
        for (int out = data.length-1; out > 0; out--) {
            swapped = false;
            for (int in = 0; in < out; in++) {
                comparisonBS1++;
                if (data[in] > data[in + 1]) {
                    swapped = true;
                    int tmp = data[in];        // swap items
                    data[in] = data[in + 1];    //
                    data[in + 1] = tmp;        //
                    swapBS1++;
                }
            }
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i] + " ");
            System.out.println();
            if (swapped == false)
                out = 0;
        }
        System.out.println("swapsBS=" + swapBS1);
        System.out.println("ComparisonsBS= " + comparisonBS1);
    }

}
