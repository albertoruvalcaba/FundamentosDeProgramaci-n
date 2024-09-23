//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String palabra = "supercalifragilisticoespialidoso";
        int longitud = palabra.length();
        System.out.println("Longitud: " + longitud);
        char posDiez = palabra.charAt(10);
        System.out.println("Caracter en posicion: " + posDiez);

        String mayusculas = palabra.toUpperCase();
        System.out.println("En mayusculas: " + mayusculas);

        String pCortada = palabra.substring(5, 15);
        System.out.println("Subcadena (5, 15): " + pCortada);

        int pOcurrencia = palabra.indexOf("i");
        System.out.println("Primera ocurrencia: " + pOcurrencia);

        int ocurrenciaDos = palabra.lastIndexOf("i");
        System.out.println("Ultima Ocurrencia: " + ocurrenciaDos);

        String minuscula = palabra.toLowerCase();
        System.out.println("En minusculas: " + minuscula);

        String subcadena = palabra.substring(6);
        System.out.println("Subcadena desde la posicion: " + subcadena);

        int uOcurrencia = palabra.indexOf("li");
        System.out.println("Ultima ocurrencia: " + uOcurrencia);

    }
}