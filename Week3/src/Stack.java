import java.util.Arrays;

public class Stack {
    int[] stack;
    int top;

    Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow!");
        } else {
            top++;
            stack[top] = value;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return -1;
        } else {
            //FILO
//            int value = stack[top];
//            stack[top] = 0;
//            top--;
//            return value;
            //FIFO
            int value = stack[0];
            for (int i = 0; i < stack.length-1 ; i++) {
                stack[i] = stack[i+1];
            }
          top--;
        return value;
        }
    }

    @Override
    public String toString() {
        return "Stack: " + Arrays.toString(stack);
        }
    }
