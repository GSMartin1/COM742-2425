import java.io.*;

public class Energy {
    public static void main(String[] args) throws IOException {

        double[] gasTemp = new double[5];
        double[] eTemp = new double[5];
        double[] outputTemp = new double[5];
        int i = 0, j =0;

        FileReader frG = new FileReader("Gas.txt");
        BufferedReader brG = new BufferedReader(frG);
        String g = brG.readLine();

        while (g!=null){
            double gasVal = Double.parseDouble(g);
            gasTemp[i] = gasVal;
            i++;
            g = brG.readLine();
        }

        brG.close();
        frG.close();

        FileReader frE = new FileReader("Electricity.txt");
        BufferedReader brE = new BufferedReader(frE);
        String e = brE.readLine();

        while (e!=null){
            double electricVal = Double.parseDouble(e);
            eTemp[j] = electricVal;
            j++;
            e = brE.readLine();
        }

        brE.close();
        frE.close();

//        for(int x = 0; x< gasTemp.length; x++){
//            System.out.println(gasTemp[x]);
//        }
//        for(int y = 0; y< eTemp.length; y++){
//            System.out.println(eTemp[y]);
//        }
        for(int z = 0; z<outputTemp.length;z++){
            outputTemp[z] = gasTemp[z] + eTemp[z];
            System.out.println(outputTemp[z]);
        }

        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter =new PrintWriter(bufferedWriter);

        for(int z = 0; z<outputTemp.length;z++){

            printWriter.println("Gas: " + gasTemp[z] +" Electricity: " + eTemp[z] + " Total: " + outputTemp[z]);
        }
        printWriter.close(); bufferedWriter.close(); fileWriter.close();

    }
}
