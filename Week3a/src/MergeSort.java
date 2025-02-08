import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int [] numbers = {2,5,9,3,13,1,16,7,8,15,4,6};

        System.out.println(Arrays.toString(numbers));

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));

    }

        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;

                // Recursively sort both halves
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);

                // Merge the sorted halves
                merge(arr, left, mid, right);
            }
        }

        private static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Create temporary arrays
            int[] leftArr = new int[n1];
            int[] rightArr = new int[n2];

            // Copy data to temporary arrays
            for (int i = 0; i < n1; i++)
                leftArr[i] = arr[left + i];

            for (int i = 0; i < n2; i++)
                rightArr[i] = arr[mid + 1 + i];

            // Merge the temporary arrays
            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArr[i] <= rightArr[j]) {
                    arr[k] = leftArr[i];
                    i++;
                } else {
                    arr[k] = rightArr[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of leftArr (if any)
            while (i < n1) {
                arr[k] = leftArr[i];
                i++;
                k++;
            }

            // Copy remaining elements of rightArr (if any)
            while (j < n2) {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }

}