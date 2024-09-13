import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int numeroUno = input.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numeroDos = input.nextInt();
        System.out.print("Ingrese tercer numero: ");
        int numeroTres = input.nextInt();
        System.out.print("Ingrese cuarto numero: ");
        double numeroCuatro = input.nextDouble();
        System.out.print("Ingrese quinto numero: ");
        double numeroCinco = input.nextDouble();

        double lineaUno = (numeroUno / numeroCuatro) * ((numeroTres + numeroDos) / numeroCinco);
        double lineaDos = (numeroDos + numeroTres) * numeroCuatro;
        double lineaTres = (numeroCinco / numeroUno) + (numeroDos / numeroTres) - numeroCuatro;
        double lineaCuatro = (numeroUno + numeroDos + numeroTres);
        double lineaCinco = (lineaUno / lineaDos);
        double lineaSeis = (lineaTres / lineaCuatro);
        double resultado = (lineaCinco / lineaSeis);
        System.out.print("El resultado es: " + resultado);



    }
}