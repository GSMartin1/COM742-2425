public class Practical4 {
    public static void main(String[] args) {
        int x = 1;
        while(x<=10){
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        // Print numbers from 1 to 10 using a for loop
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Iterate through an array using a for-each loop
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
