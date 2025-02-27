import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter coin value");
        int newcoin = keyboard.nextInt();
        String coin = validCoin(newcoin);
        System.out.println(coin);
    }

    public static String validCoin(int ncoin) {
        String value = "";

        switch (ncoin) {
            case 1:
                value = "One penny";
                break;
            case 2:
                value = "Two pence";
                break;

            case 5:
                value = "Five pence";
                break;

            case 10:
                value = "Ten pence";
                break;

            case 20:
                value = "Twenty pence";
                break;

            case 50:
                value = "Fifty pence";
                break;

            case 100:
                value = "One pound";
                break;

            case 200:
                value = "Two pounds";
                break;

            default:
                value = "Invalid coin";
                break;

        }
        return value;
    }

}
