import java.io.*;
import java.util.Arrays;

public class ReadAndWrite {
    public static void main(String[] args){
//        writeNumbers();

//        int[] numbersIn = readNumbers("100Search.txt");

//        System.out.println(Arrays.toString(numbersIn));


    }

    public static int[] readNumbers(String filename) {

        int[] array = new int[100];
        int readIn, i=0;

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            //System.out.println(array.length);

            String in = br.readLine();

            while (in != null) {
                readIn = Integer.parseInt(in);
                array[i] = readIn;
                i++;
                in = br.readLine();

            }

            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return array;
    }

    public static void generateRandom() {
        int [] num = new int [100];
        int min = 1;
        int max = 100;

        for (int i = 0; i< num.length; i++){
            num[i]= (int)(Math.random() * (max - min + 1) + min);
        }
    }

    public static void writeNumbers() {
        try {
            FileWriter fw = new FileWriter("100Search.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i = 1; i <= 100; i++) {
                pw.println(i);
            }
            bw.close();
            pw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
