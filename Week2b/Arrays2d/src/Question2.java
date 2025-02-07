public class Question2 {
    public static void main(String[] args){
        int[][] tda = new int[][] {{1,2,3},{4,5,6},{7,8,9},{1,1,1}};

        for(int row = 0; row < tda.length; row++){
            for(int col = 0; col < tda[0].length; col++){
                System.out.print(tda[row][col] + " ");
            }
            System.out.println();
        }

        tda[3][2] = 9;
        tda[1][2] = 0;

    }
}
