import java.util.HashSet;
import java.util.Set;

public class Question4 {
    public static void main(String[] args) {
        int Numbers[] = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < 10; i++) {
            s.add(Numbers[i]);
        }
        System.out.println("S="+ s);

        Set<Integer> multiply = new HashSet<Integer>();
        for(int i = 0; i < 10; i++) {
            multiply.add(Numbers[i]*3);
        }
        System.out.println("New set="+ multiply);

    }
}
