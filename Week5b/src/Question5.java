import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5};
        int total = sumArray(numbers);
        int[] shifted = shiftArray(numbers);
        System.out.println(total);
        printArray(numbers);
        printArray(shifted);
    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static int sumArray(int[] inArray) {
        int sum = 0;
        for (int i = 0; i < inArray.length; i++) {
            sum += inArray[i];
        }
        return sum;
    }

    public static int[] shiftArray(int[] inArray) {
        int[] outArray = new int[inArray.length];
        outArray[0] = -1;

        for (int i = 0; i < inArray.length - 1; i++) {
            outArray[i + 1] = inArray[i];
        }
        return outArray;
    }
}