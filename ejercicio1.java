import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Celsius a Fahrenheit

        System.out.println("Ingresa los grados en celsius que deseas convertir: ");
        int celsius = sc.nextInt();

        double conversion = celsiusAFahrenheit(celsius);
        System.out.println(celsius + " a Fahrenheit es: " + conversion);
    }
    public static double celsiusAFahrenheit(int celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
}