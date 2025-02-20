import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number;

        System.out.print("How many odd numbers do you want the sequence for ");
        number = keyboard.nextInt();
        oddNumbers(number);
    }//main


    public static int oddNumbers(int number) {

        int answer;

        if (number == 1) {
            answer = 3;
            System.out.println(answer);
        }//if
        else {
            answer = oddNumbers(number - 1) + 2;
            System.out.println(answer);
        }//else
        return answer;
    }

}
