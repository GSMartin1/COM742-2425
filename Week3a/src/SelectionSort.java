import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int [] numbers = {2,5,9,3,13,1,16,7,8,15,4,6};

        System.out.println(Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));

    }

    public static void selectionSort(int data[]) {
        int in, out, min;
        int comparisonSS = 0, swapSS = 0;
        for (out=0; out < data.length-1; out++) {
            min = out;
            for (in = out+1; in < data.length; in++) {
                comparisonSS++;
                if (data[in] < data[min]) {
                    min = in;
                    swapSS++;          // new minimum
                }
            }
            int tmp = data[out];     // swap items
            data[out] = data[min];   //
            data[min] = tmp;       //
        }
        System.out.println("swapsSS=" + swapSS);
        System.out.println("ComparisonsSS= " + comparisonSS);
    }
}
