import java.util.Arrays;
import java.util.Random;

public class Q3 {
    public static void main(String[] args){
        Random rand = new Random();
        int [][] numArrays = new int [10][10];

        for(int i = 0; i<numArrays[0].length; i++){
            for(int j = 0; j<numArrays.length; j++){
                numArrays[i][j] = rand.nextInt(100000) + 1;
            }
        }

        System.out.print(Arrays.deepToString(numArrays));

        System.out.println(" ");

        int minData = findMin(numArrays);
        int maxData = findMax(numArrays);

        System.out.println("Min = " + minData);
        System.out.println("Max = " + maxData);
}
    public static int findMin(int [][] data){
        int min = data[0][0];

        for(int i = 0; i<data[0].length; i++){
            for(int j = 0; j<data.length; j++){
                if (data[i][j]<min)
                    min = data[i][j];
            }
        }
        return min;
    }

    public static int findMax(int [][] data){
        int max = data[0][0];

        for(int i = 0; i<data[0].length; i++){
            for(int j = 0; j<data.length; j++){
                if (data[i][j]>max)
                    max = data[i][j];
            }
        }
        return max;
    }


}
