import java.util.Random;

public class Question4 {
    public static void main(String[] args) {
        Random ran = new Random(0); // Random num generator obj - seed=0

        int [][]a = new int[5][5]; // 20 rows, 8 cols
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){
                a[r][c] = ran.nextInt(1000) + 1; // generate random num
            }
        }

        print2D(a);
        int sum = sum2DArray(a);
        System.out.println("Sum is equal to: " + sum);

    }
    public static void print2D(int[][] a){
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }
    public static int sum2DArray(int[][] a) {

        int sum = 0;
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){
                sum+=a[r][c];
            }
        }
        return sum;
    }

}
