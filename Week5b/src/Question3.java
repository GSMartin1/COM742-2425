public class Question3 {
    public static void main(String[] args){

    }
    public static int [] selectionSort(int data[]) {
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
            data[min] = tmp;         //
            for (int i = 0; i < data.length; i++)
                System.out.print(data[i] + " ");
            System.out.println();
        }
        return data;
    }

}
