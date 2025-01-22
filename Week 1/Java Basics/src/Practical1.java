import java.text.DecimalFormat;

public class Practical1 {
    public static void main(String[] args) {

        char initial = 'J';
        String name = "Smith";
        int age = 25;
        double salary = 21000.00;
        boolean isEmployed = true;

        DecimalFormat df = new DecimalFormat("00,000.00");

        System.out.print(initial+ " " +name + " is " + age + " years old, ");

        if(isEmployed=true){
            System.out.println("is currently employed and has a salary of £" + df.format(salary) + " per year.");
        }else{
            System.out.println("is not employed and has a salary of £" + salary + " per year.");
        }
    }
}
