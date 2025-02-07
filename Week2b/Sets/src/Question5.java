import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Question5 {
    public static void main(String[] args) {

        try {
            FileReader frA = new FileReader("NumbersA.txt");
            BufferedReader brA = new BufferedReader(frA);
            FileReader frB = new FileReader("NumbersB.txt");
            BufferedReader brB = new BufferedReader(frB);

            String valueA = brA.readLine();
            String valueB = brB.readLine();
            //int valueB = brB.read();

            Set<Integer> NumbersA = new HashSet<>();
            Set<Integer> NumbersB = new HashSet<>();

            //NumbersA.add(Integer.parseInt(valueA));
            //System.out.println(NumbersA);

//            NumbersB.add(Integer.parseInt(valueB));
//
            while (valueA != null) {
                int newValue = Integer.parseInt(valueA);
                NumbersA.add(newValue);
                valueA = brA.readLine();
            }

            System.out.println(NumbersA);
//
//            while (valueB != null) {
//                int newValueB = Integer.parseInt(valueB);
//                NumbersB.add(newValueB);
//                valueB = brB.readLine();
//            }
//
//            System.out.println(NumbersA);
//            System.out.println(NumbersB);
//
//
//            Set<Integer> Union = new HashSet<>();
//            Union.addAll(NumbersA);
//            Union.addAll(NumbersB);
//
//
//            System.out.println("the union of NumbersA and NumbersB is " + Union);
//
//            if (Union.contains(10))
//                System.out.println("The Union contains the value 10");
//            else
//                System.out.println("The Union does not contain the value 10");
//
//            Set<Integer> intersection = new HashSet<>();
//            intersection.addAll(NumbersA);
//            intersection.retainAll(NumbersB);
//
//
//            System.out.println("after the  intersection of NumbersA and NumbersB: " + intersection);

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
