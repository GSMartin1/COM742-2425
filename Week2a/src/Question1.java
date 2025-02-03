import java.util.LinkedList;

public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(2);
        numList.add(4);
        numList.add(8);
        numList.add(16);
        numList.add(32);
        numList.add(64);
        numList.add(128);

        LinkedList <Integer> numbers = new LinkedList<>();

        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);

        System.out.println(numbers);
        numList.addAll(3, numbers);

        System.out.println(numList);
        Number number = numList.get(5);

        System.out.println("the value at position 5 is "+ number);

        numList.set(6, 23);

        System.out.println(numList);
        numList.remove(Integer.valueOf(16));

        numList.forEach(s -> System.out.println(s));

    }

}