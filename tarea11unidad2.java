//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombre = "García, Juan Carlos";
        int longitudN = nombre.length();
        System.out.println("Longitud del nombre: " + longitudN);

        String apellido = nombre.substring(0, 6);
        System.out.println("Apellido: " + apellido);

        String nombreSnapellido = nombre.substring(8, 19);
        System.out.println("Nombre sin apellido: " + nombreSnapellido);

        String Pnombre = nombre.substring(8, 12);
        System.out.println("Primer nombre: " + Pnombre);

        String mayusculas = apellido.toUpperCase();
        System.out.println("Apellido en mayusculas: " + mayusculas);

        String minusculas = nombre.toLowerCase();
        System.out.println("Nombre en minusculas: " + minusculas);

        char posCuatro = nombre.charAt(4);
        System.out.println("Caracter en posicion 5: " + posCuatro);

        int pOcurrencia = nombre.indexOf("a");
        System.out.println("Primera ocurrencia de 'a': " + pOcurrencia);

        int uOcurrencia = nombre.lastIndexOf("a");
        System.out.println("Ultima ocurrencia de 'a': " + uOcurrencia);
    }
}