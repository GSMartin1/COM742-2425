import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question1b {
    public static void main(String[] args) {
        writeNumbers("fifty.txt", 50);
    }
    public static void writeNumbers(String fname, int max) {
        try {
            FileWriter fw = new FileWriter(fname);     BufferedWriter bw = new BufferedWriter(fw);      PrintWriter pw = new PrintWriter(bw);
            for (int i=1; i<=max; i++) {
                pw.println(i);
            }

            bw.close(); pw.close();fw.close();
        }

        catch (IOException e) {
            System.out.println(e);
        }
    }
}
