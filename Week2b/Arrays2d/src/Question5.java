public class Question5 {
    public static void main(String[] args) {

        char[][] a = new char[][]{{'a', 'b', 'c'}, {'d', 'd', 'd'}, {'g', 'h', 'i'}};

        findChar2DArray(a, 'b');
        findChar2DArray(a, 'd');
        findChar2DArray(a, 'z');
    }

        public static boolean findChar2DArray(char[][] a, char c2f) {
            for(int r = 0; r < a.length; r++){
                for(int c = 0; c < a[0].length; c++){
                    if(a[r][c] == c2f){
                        System.out.println("Char: " + c2f + " @ (" + r + "," + c + ")");
                        return true;
                    }
                }
            }
            System.out.println("Char: " + c2f + " not found");
            return false;
        }
}

