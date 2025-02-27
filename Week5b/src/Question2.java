public class Question2 {
    public static void main(String[] args) {
        double c = 0;
        double f = CelsiusToFahrenheit(c);
        if (f < 37)
            System.out.println("Warning… Frost Alert!!.");

        System.out.println("Current Temp in deg C is " + c );
        System.out.println("Current Temp in deg F is " + f );

    }

    public static double CelsiusToFahrenheit (double Celsius) {

        double F = (9.0/5) * Celsius + 32;
        return F;
    }
}