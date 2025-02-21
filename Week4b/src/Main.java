public class Main {
    public static void main(String[] args) {
            String input = "cat";
            String reversed = reverseString(input);
            System.out.println("Reversed: " + reversed);  // Output: "tac"
        }

    // Recursive function to reverse a string
    public static String reverseString(String s) {
        if (s.isEmpty()) {  // Base case: Empty string
            return "";
        }
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }
}