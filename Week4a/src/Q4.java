import java.io.*;
import java.util.Random;

public class Q4 {
    public static void main(String[] args) {

        int fileSize = 1000;
        writeToFile("compare.txt", fileSize);
        System.out.println(averageFor("compare.txt", fileSize));
        System.out.println(averageWhile("compare.txt", fileSize));

    }

    public static void writeToFile(String fileName, int size) {

        Random rand = new Random();

        try{
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i=0; i<size; i++) {
                pw.println(rand.nextInt(size*10) + 1);
            }
            pw.close();
            bw.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static int averageFor(String fileName, int size){

        int total = 0;

        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);


            for (int i=0; i<size; i++) {
                String c1 = br.readLine();
                int num = Integer.parseInt(c1);
                total = total+num;
            }

            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

        int aver = total/size;
        return aver;

    }

    public static int averageWhile(String fileName, int size){

        int total = 0;

        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String c1 = br.readLine();
            while (c1 !=null){

                int num = Integer.parseInt(c1);
                total = total+num;
                c1 = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

        int aver = total/size;
        return aver;

    }
}
