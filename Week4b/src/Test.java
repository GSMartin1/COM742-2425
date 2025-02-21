public class Test {
    public static void main(String[] args){
        int n = 8;

        long startTimeLinear = System.nanoTime();
        System.out.println("Linear: " +n + "! = " + factorialLinear(n));
        long endTimeLinear = System.nanoTime();
        long totalTimeLinear = endTimeLinear - startTimeLinear;
        System.out.println("Linear time: " + totalTimeLinear);

        long startTimeRecursion = System.nanoTime();
        System.out.println("Recursive: " + n + "! = " + factorialRecursion(n));
        long endTimeRecursion = System.nanoTime();
        long totalTimeRecursion = endTimeRecursion - startTimeRecursion;
        System.out.println("Recursive time: " + totalTimeRecursion);
    }

    private static int factorialLinear(int n) {
        //base case
        int result = 1;

        for(int i = n; i > 1; i--){
            result = result * i;
//            System.out.println(result);
        }

        return result;
    }

    private static int factorialRecursion(int n){
        if(n==1){
            return 1;
        }
        else {
//            System.out.println(n-1);
            return n * factorialRecursion(n-1);
        }
    }
}