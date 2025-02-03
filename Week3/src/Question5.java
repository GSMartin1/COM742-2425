import java.util.LinkedList;

public class Question5 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

    }

    public LinkedList<Integer> push(LinkedList<Integer> x, int value) {
        x.add(0,value);
        return x;
    }

    public LinkedList<Integer> pop(LinkedList<Integer> x) {
        x.remove(0);
        return x;
    }

}
