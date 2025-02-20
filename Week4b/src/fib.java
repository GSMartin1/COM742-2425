public class fib {
    public static void main(String args[]) {
        int fibonacci = 0;
        int fibonacci_prev = 0;
        int fibonacciNew = 0;

        for (int i = 0; i < 9; i++) {
            if (fibonacci == 0) {
                fibonacci = 1;
                fibonacci_prev = 1;
                System.out.println(fibonacci);
                System.out.println(fibonacci_prev);
            } else {

                fibonacciNew = fibonacci + fibonacci_prev;
                System.out.println(fibonacciNew);

                fibonacci_prev = fibonacci;
                fibonacci = fibonacciNew;

            }

        }
    }
}
