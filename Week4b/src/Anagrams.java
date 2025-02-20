public class Anagrams {

    public static void main(String[] args) {

        char [ ] myWord = {'R', 'A', 'T', 'S'};

        doAnagram (myWord, 4, 4);

    }//main

    public static void rotate(char[] anyArray, int noOfChars, int newSize) {

        //Method to rotate left all characters from position to end
        int position = noOfChars - newSize;
        char temp = anyArray[position];
        int index;

        for (index = position + 1; index < noOfChars; index++){
            anyArray[index - 1] = anyArray[index];
        }//for

        anyArray[index - 1] = temp;
    }//rotate

    public static void doAnagram(char[] anyArray, int noOfChars, int newSize) {
        // Recursive method to anagram a word

        if (newSize > 1) {  // More to do??
            for (int loop = 0; loop < newSize; loop++) {
                doAnagram(anyArray, noOfChars, (newSize - 1));
                if (newSize == 2) {
                    for (int index = 0; index < noOfChars; index++) {
                        System.out.print(anyArray[index]);
                    }//for
                    System.out.println();
                }//if
                rotate(anyArray, noOfChars, newSize);
            }//for
        }//if
    }//doAnagram

}
