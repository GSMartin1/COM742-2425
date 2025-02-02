import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        readNumbers("fifty.txt");

    }
        public static void readNumbers(String fname){
        int count = 0;
        try {
            // open file
            FileReader fr = new FileReader(fname); // open file
            BufferedReader br = new BufferedReader(fr);
            // initialise count

            String c = br.readLine();

            while (c != null) { // loop until end of file
                // read number from file and add to count
                count = count + Integer.parseInt(c);
                c = br.readLine();
            }

            br.close();  // close file
            fr.close();
            System.out.println("Total is " + count); // print
        } catch (
                IOException e) {
            System.out.println(e);
        }
    }
}
