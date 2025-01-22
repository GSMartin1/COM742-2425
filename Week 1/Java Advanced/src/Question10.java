public class Question10 {
    public static void main(String[] args){
        ReverseChar Reverse = new ReverseChar();

        char[] originalArray = {'5','1','1'};

        char[] reversedArray = Reverse.reverse(originalArray,originalArray.length);

        int[] HexArray = new int[originalArray.length];

        for(int i = 0; i<reversedArray.length; i++) {
            if (reversedArray[i] == '1'){
                HexArray[i] = 1;
            }
            else if (reversedArray[i] == '2'){
                HexArray[i] = 2;
            }
            else if (reversedArray[i] == '3'){
                HexArray[i] = 3;
            }
            else if (reversedArray[i] == '4'){
                HexArray[i] = 4;
            }
            else if (reversedArray[i] == '5'){
                HexArray[i] = 5;
            }
            else if (reversedArray[i] == '6'){
                HexArray[i] = 6;
            }
            else if (reversedArray[i] == '7'){
                HexArray[i] = 7;
            }
            else if (reversedArray[i] == '8'){
                HexArray[i] = 8;
            }
            else if (reversedArray[i] == '9'){
                HexArray[i] = 9;
            }
            else if (reversedArray[i] == 'A'){
                HexArray[i] = 10;
            }
            else if (reversedArray[i] == 'B'){
                HexArray[i] = 11;
            }
            else if (reversedArray[i] == 'C'){
                HexArray[i] = 12;
            }
            else if (reversedArray[i] == 'D'){
                HexArray[i] = 13;
            }
            else if (reversedArray[i] == 'E'){
                HexArray[i] = 14;
            }
            else if (reversedArray[i] == 'F'){
                HexArray[i] = 15;
            }
            else {
                HexArray[i] = 0;
            }
            System.out.println(HexArray[i]);
        }

        int total = 0;

        for (int i = 0; i < HexArray.length; i++){

            total += Math.pow(16,i)*HexArray[i];

        }

        System.out.println(total);

    }
}

class ReverseChar{
    public char[] reverse(char[] x, int size){
        char[] y = new char[size];
        int j = 0;

        for (int i = x.length-1; i>=0; i--){
            y[j] = x[i];
            j += 1;
        }

        return y;
    }
}