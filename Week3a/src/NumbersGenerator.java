import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumbersGenerator {
    public static void main(String[] args){

//        int[] numbers = generateRandom(100);
//        int[] numbers = readNumbers("RandomNums.txt");

    }

    public static int[] readNumbers(String filename) {

        int[] array = new int[1];

        try {

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            Integer size = Integer.parseInt(c);
            array = new int[size];
            //System.out.println(array.length);

            for (int i=0; i< size; i++) {
                c = br.readLine();
                array[i] = Integer.parseInt(c);
                //System.out.println(array[i]);
            }
            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return array;
    }

    public static int[] generateRandom(int qty) {
        int [] num = new int [qty];
        int min = 1;
        int max = 100;
        for (int i = 0; i<qty; i++){
            num[i]= (int)(Math.random() * (max - min + 1) + min);
        }
        return num;
    }
}
