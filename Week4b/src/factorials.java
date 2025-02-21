public class factorials {
    public static void main(String[] args){

        System.out.println(factorials(5));

    }
    public static int factorials(int n) {
        if (n == 1){
            return 1;
        }
       else {
           System.out.println(n-1);
           return n * factorials(n - 1);
        }
    }
}
