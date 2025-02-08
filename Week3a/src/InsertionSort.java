import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int [] numbers = {2,5,9,3,13,1,16,7,8,15,4,6};

        System.out.println(Arrays.toString(numbers));

        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));


    }

    public static void insertionSort( int data[] ) {
        int in, out, temp;
        int copies = 0, swapIS = 0;
        for (out=1; out < data.length; out++) {
            temp = data[out];
            copies++;
            for (in=out; in > 0 && data[in-1] >= temp; in--) {
                data[in] = data[in-1];
                swapIS++;
            }
            data[in] = temp;
        }
        System.out.println("swapsIS=" + swapIS);
        System.out.println("CopiesIS= " + copies);
    }
}
