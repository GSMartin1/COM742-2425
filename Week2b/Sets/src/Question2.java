import java.util.HashSet;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Set<String> MonthsA = new HashSet<>();
        Set<String> MonthsB = new HashSet<>();
        MonthsA.add("Jan");
        MonthsA.add("Feb");
        MonthsA.add("Mar");
        MonthsA.add("Apr");
        MonthsA.add("May");
        MonthsA.add("Jun");

        MonthsB.add("May");
        MonthsB.add("Jun");
        MonthsB.add("Jul");
        MonthsB.add("Aug");

        Set<String> union = new HashSet<>();
        union.addAll(MonthsA);
        union.addAll(MonthsB);
        System.out.println("the union is " + union);

        Set<String> intersection = new HashSet<>();
        intersection.addAll(MonthsA);
        intersection.retainAll(MonthsB);
        System.out.println("after intersection: " + intersection);

        MonthsA.remove("May");
        MonthsA.remove("Jun");

        Set<String> union2 = new HashSet<>();
        union2.addAll(MonthsA);
        union2.addAll(MonthsB);

        System.out.println("the new union is " + union2);
        System.out.println("The size of the Union set is " + union2.size());

        Set<String> intersection2 = new HashSet<>();
        intersection2.addAll(MonthsA);
        intersection2.retainAll(MonthsB);

        System.out.println("after intersection: " + intersection2);

        if (intersection2.isEmpty())
            System.out.println("The intersection set is empty");
        else
            System.out.println("The intersection set is not empty");

    }
}
