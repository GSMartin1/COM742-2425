public class factorials {
    public static void main(String[] args){
        System.out.println(factorials(5));
    }
    public static int factorials(int n) {
        if (n == 1){
            return 1;
        }
       else {
            return n * factorials(n - 1);
        }
    }
}
