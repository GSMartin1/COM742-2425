public class Binary8BitReader {
    public static void main(String[] args){

        int[] input = {1,1,1,1,1,1,1,1};
        int total = 0;

        for(int i = input.length-1; i>=0; i--) {
            if (input[i] == 1) {
                total += Math.pow(2,i);
            }
        }
        System.out.println("Total = " +  total + " in Decimal");

    }
}
