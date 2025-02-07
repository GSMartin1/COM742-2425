import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {

        Set<Integer> valuesA = new HashSet<>();
        valuesA.add(24);
        valuesA.add(26);
        valuesA.add(28);
        valuesA.add(30);
        valuesA.add(32);

        Set<Integer> valuesB = new HashSet<>();
        valuesB.add(30);
        valuesB.add(32);
        valuesB.add(35);
        valuesB.add(40);
        valuesB.add(45);
        valuesB.add(50);

        Iterator<Integer> iteratorA = valuesA.iterator();

        while (iteratorA.hasNext()) {
            int numA = iteratorA.next();
            System.out.println(numA);
        }

        Iterator<Integer> iteratorB = valuesB.iterator();

        while (iteratorB.hasNext()) {
            int numB = iteratorB.next();
            System.out.println(numB);
        }

        valuesA.add(34);
        valuesB.add(34);

        Set<Integer> Union = new HashSet<>();

        Union.addAll(valuesA);
        Union.addAll(valuesB);
        System.out.println("the union is" + Union);

    }
}
