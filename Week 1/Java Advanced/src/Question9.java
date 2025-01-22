import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Print printer = new Print();
        Convert convert = new Convert();

        printer.print("Hello, please enter a phrase and I will convert it to Pig Latin");

        String phrase = scanner.nextLine();
        String[] oldPhrase = phrase.split(" ");
        String newPhrase = "";

        for(int i =  0; i < oldPhrase.length; i++){
            newPhrase += convert.convert(oldPhrase[i]);
            newPhrase += " ";
        }
        printer.print(newPhrase);
    }
}

class Print{
    public void print(String x){
        System.out.println(x);
    }
}

class Convert{
    public String convert(String x){
        //Vowel?
        x = x.toLowerCase();
        char z = x.charAt(0);
        if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u'){
            x = x + "-ay";
        }

        else{
            String word = x;
            String newWord = word.substring(1, word.length());

            x = newWord + "-" + x.charAt(0) + "ay";

        }

        return x;
    }
}
