import java.io.*;

public class Question3 {
    public static void main(String[] args) {
        int total = countTotalPositiveValue("fifty.txt");
        System.out.println("Total is " + total);

        int[] nums = {2, 4, 7, 12, 67, 2};
        writeToFile(nums, "nums.txt");
    }

    // return total value of numbers in specified file
    public static int countTotalPositiveValue(String fileName) {
        int count = 0;
        int num;
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            while (c != null) { // while not end of file
                num = Integer.parseInt(c);
                if (num > 0) {
                    count += num;  // or count += num;
                }
                c = br.readLine();
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        return count;
    }

    // write array data elements to specified file
    public static void writeToFile(int[] data, String fileName) {
        try{
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i=0; i<data.length; i++) {
                pw.println(data[i]);
            }
            pw.close();
            bw.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

//    public static void writeToFile(String[] data, String fileName) {
//        try{
//            FileWriter fw = new FileWriter(fileName);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//
//            for (int i=0; i<data.length; i++) {
//                pw.println(data[i]);
//            }
//            pw.close();
//            bw.close();
//            fw.close();
//        }
//        catch (IOException e) {
//            System.out.println(e);
//        }
//    }
}
