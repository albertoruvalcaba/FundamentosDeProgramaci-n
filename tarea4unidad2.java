//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        double divisorUno = (12 + 8) * (5 - 3) - (6 / 2);
        double dividendoUno = (3 * 4) + (8 / 2);
        double resultadoUno = divisorUno / dividendoUno;
        System.out.println(resultadoUno);

        // Ejercicio 2
        double divisorDos = (((9 * 5) - (15 + 3) + (8 * 2) - (12 / 4)) * (7 + 2) - (6 * 3/2)) / (2 + (3 * 2)/(4 - 2)) + 5 * ((8/4) + 1) - (6 /(2 + 1));
        double dividendoDos = (((4 + 2) * (7 - 1)) / (3 + 1) + ((3 * 2) - (5 + 1)) * (8 / 2)) / (3 + (6 / 2.0) + (7 / 2)) + 2 * (3 + (8 / 4));
        double resultadoDos = divisorDos / dividendoDos;
        System.out.println(resultadoDos);

        // Ejercicio 3
        double divisorTres = ((6 + 4) * 3) - (18 / 2);
        double dividendoTres = (8 - 5) + (3 * 2);
        double resultadoTres = divisorTres / dividendoTres;
        System.out.println(resultadoTres);
    }
}