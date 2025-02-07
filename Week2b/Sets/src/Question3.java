import java.util.HashSet;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> numbersEven = new HashSet<>();
        Set<Integer> numbersOdd = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbersEven.add(2);
        numbersEven.add(4);
        numbersEven.add(6);
        numbersEven.add(8);
        numbersEven.add(10);
        numbersEven.add(12);

        numbersOdd.add(1);
        numbersOdd.add(3);
        numbersOdd.add(5);
        numbersOdd.add(7);
        numbersOdd.add(9);

        Set<Integer> diffNumOdd = new HashSet<>();
        diffNumOdd.addAll(numbers);
        diffNumOdd.removeAll(numbersOdd);
        System.out.println("Result after first difference: " + diffNumOdd);

        Set<Integer> diffNumEven = new HashSet<>();
        diffNumEven.addAll(numbers);
        diffNumEven.removeAll(numbersEven);
        System.out.println("Result after second difference: " + diffNumEven);

        numbers.remove(4);
        numbersEven.remove(4);
        numbersOdd.remove(4);

        if (numbers.containsAll(numbersEven))
            System.out.println("numbersEven is a subset of numbers");
        else
            System.out.println("numbersEven is a not subset of numbers");


    }
}
