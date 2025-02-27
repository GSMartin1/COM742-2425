public class methods {
    public static void main(String[] args){
        //Scanner keyboard = new Scanner(System.in);

        int number = 5;

        //System.out.println("Numbers in Sequence?");

        //number = keyboard.nextInt();
        numSeq(number);

    }

    public static int numSeq(int number){
        int answer;

        if (number == 1){
            answer = 1;
            System.out.println(answer);
        }
        else{
            answer = numSeq(number - 1) +3;
            System.out.println(answer);
        }
        return answer;
    }

}