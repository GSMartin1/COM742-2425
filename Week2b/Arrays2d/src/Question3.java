public class Question3 {
    public static void main(String[] args) {
        int[][] a = new int[5][2];

        double[][] b = new double[10][15];

        String[][] c = new String[3][10];

        for (int i = 0; i<a.length;i++) {
            for (int j = 0; j < a[0].length; j++) {
                setValueAt(a, i, j, i);
            }
        }
        for (int i = 0; i<a.length;i++){
            for(int j = 0; j<a[0].length;j++) {
                System.out.print(a[i][j]);
                }
            System.out.println();
        }

        int value = getValueAt(a,0,0);
        System.out.println(value);
    }

    public static int getValueAt(int[][] a, int row, int col){

        return a[row][col];
    }

    public static void setValueAt(int[][] a, int row, int col, int value){

        a[row][col] = value;
    }


}
