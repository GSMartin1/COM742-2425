import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<String> strList = new LinkedList<>();strList.add("Mary");
        strList.add("John");
        strList.add("Peter");
        strList.add("Shane");
        strList.add("Seamus");
        strList.add("James");
        System.out.println("The list is " +strList);

        List<String> subList = strList.subList(1, 4);
        System.out.println(subList);

        Collections.reverse(strList);

        System.out.println(strList);

        Collections.sort(strList);
        System.out.println("The sorted list is " + strList);

        List<String> copyStrList = new LinkedList<>();
        copyStrList.add(" "); copyStrList.add(" "); copyStrList.add(" ");

        copyStrList.add(" "); copyStrList.add(" "); copyStrList.add(" ");

        Collections.copy(copyStrList, strList);
        System.out.println(copyStrList);

        Collections.shuffle(copyStrList);
        System.out.println(copyStrList);

        int index = strList.lastIndexOf("Shane");
        System.out.println("The index is " + index);

    }
}
