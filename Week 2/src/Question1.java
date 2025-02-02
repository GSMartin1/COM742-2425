import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question1 {
    public static void main(String[] args) {
        writeNumbers();
    }
    public static void writeNumbers() {
        try {
            FileWriter fw = new FileWriter("fifty.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i=1; i<=50; i++) {
                pw.println(i);
            }
            bw.close(); pw.close();fw.close();
        }

        catch (IOException e) {
            System.out.println(e);
        }

    }
}

