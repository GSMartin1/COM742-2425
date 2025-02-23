import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
        int[] coins = {5, 10, 20, 50, 100};

        //int[] array = {1000};

        int change[] = makeChange1(coins,10);

        System.out.println(Arrays.toString(change));

    }
    public static int[] makeChange(int[] coins, int amount) {
        int change[] = new int[coins.length];
        int noCoins = 0;

        int i = coins.length - 1;
        while (amount > 0 && i >= 0) {
            if (amount <= coins[i] ) {
                noCoins += coins[i]/amount;
            }
            else{
                change[i] += coins[i]%amount;
            }
            i--;
        }
        System.out.println("Coins: " + noCoins);
        return change;
    }

    public static int[] makeChange1(int[] coins, int amount) {
        int[] change = new int[coins.length];
        int i = coins.length - 1;
        while (amount > 0 && i >= 0) {
            if (coins[i] <= amount) {
                change[i] = amount / coins[i];
                amount -= change[i] * coins[i];
            }
            i--;
        }
        return change;
    }
}
