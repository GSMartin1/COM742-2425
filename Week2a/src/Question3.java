import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> listNum = new LinkedList<>();
        LinkedList<Integer> copyListNum = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++)
        {
            listNum.add(random.nextInt(100));
        }

        System.out.println(listNum);

        copyListNum = listNum;

        listNum.addFirst(16);
        listNum.addLast(24);

        System.out.println(copyListNum);

        if (listNum.contains(6)) {
            System.out.println("The first occurrence of 6 is at location " + listNum.indexOf(6));
            System.out.println("The last occurrence of 6 is at location " + listNum.lastIndexOf(6));
        }
        else {
            System.out.println("There is no such element");
        }
        if (listNum.contains(15)) {
            System.out.println("The first occurrence of 15 is at location " + listNum.indexOf(15));
            System.out.println("The last occurrence of 15 is at location " + listNum.lastIndexOf(15));
        }
        else {
            System.out.println("There is no such element");
        }

        for(int i = 0; i<listNum.size(); i++){
            System.out.println ("The value at position " + i + " is " +listNum.get(i));
        }

        listNum.removeFirst();
        listNum.removeLast();
        listNum.remove(4);

        Collections.swap(listNum, 3, 16);

        LinkedList<Integer> listNum2 = new LinkedList<>();
        listNum2.add(2);
        listNum2.add(4);
        listNum2.add(6);
        listNum2.add(7);
        listNum2.add(8);
        listNum2.add(1);
        listNum2.addAll(listNum);

        System.out.println(listNum2);

        int num = removeInt(listNum2);
        System.out.println(num);

        if (listNum2.contains(32))
            System.out.println("32 exists in the list");
        else
            System.out.println("There is no such element");

        if (listNum2.isEmpty())
            System.out.println("This list is empty");
        else
            System.out.println("This list contains values");

    }
    public static int removeInt(LinkedList<Integer> listNew){
        Integer value = listNew.get(0);
        return value;
    }

}
