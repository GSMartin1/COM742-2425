public class Stacks {
    public static void main(String[] args) {

        Stack stack = new Stack(10);

        System.out.println(stack);

        stack.push(10);
        stack.push(11);
        stack.push(12);

        System.out.println(stack);

        stack.pop();
        stack.pop();

        System.out.println(stack);

    }
}
