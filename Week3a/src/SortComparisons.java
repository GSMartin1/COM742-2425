public class SortComparisons {
    public static void main(String[] args){
//        Random random = new Random();
//        int[] arrayRandom = new int[100];
//        for(int i = 0; i<arrayRandom.length;i++){
//            arrayRandom[i] = random.nextInt(100)+1;
//        }
//
//        System.out.println(Arrays.toString(arrayRandom));
//
//        int[] arrayBubble = bubbleSort(arrayRandom);
//        System.out.println(Arrays.toString(arrayBubble));
//
//        int[] arraySelection = bubbleSort(arrayRandom);
//        System.out.println(Arrays.toString(arraySelection));
//
//        int[] arrayInsertion = bubbleSort(arrayRandom);
//        System.out.println(Arrays.toString(arrayInsertion));
//
    }

    public static int[] bubbleSort(int[] data) {
        for (int out = data.length-1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (data[in] > data[in+1]) {
                    int tmp = data[in];		// swap items
                    data[in] = data[in+1];	//
                    data[in+1] = tmp;		//
                }
            }
        }
        return data;
    }

    public static int[] selectionSort(int data[]) {
        int in, out, min;
        for (out=0; out < data.length-1; out++) {
            min = out;
            for (in = out+1; in < data.length; in++) {
                if (data[in] < data[min]) {
                    min = in;            // new minimum
                }
            }
            int tmp = data[out];     // swap items
            data[out] = data[min];   //
            data[min] = tmp;		   //
        }
        return data;
    }


    public static int[] insertionSort(int data[]) {
        int in, out, temp;
        for (out=1; out < data.length; out++) {
            temp = data[out];
            for (in=out; in > 0 && data[in-1] >= temp; in--) {
                data[in] = data[in-1];
            }
            data[in] = temp;
        }
        return data;
    }


}
