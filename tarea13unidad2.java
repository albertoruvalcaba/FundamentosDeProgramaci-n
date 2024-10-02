//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cadena = "12345;Laptop HP Pavilion;1500.99;Electronica";
        int longitud = cadena.length();
        System.out.println("Longitud de la palabra: " + longitud);
        String id = cadena.substring(0,5);
        System.out.println("ID del producto: " + id);
        String nombreDelProducto = cadena.substring(6,24);
        System.out.println("Nombre del producto: " + nombreDelProducto);
        String productoEnMayus = nombreDelProducto.toUpperCase();
        System.out.println("Producto en mayusculas: " + productoEnMayus);
        String precio = cadena.substring(25,32);
        System.out.println("Precio del producto: " + precio);
        char caracterPosDiez = nombreDelProducto.charAt(10);
        System.out.println("Caracter posicion 10: " + caracterPosDiez);
        int primerOcurrenciaA = nombreDelProducto.indexOf('a');
        System.out.println("Primer Ocurrencia A: " + primerOcurrenciaA);
        int ultimoOcurrenciaO = nombreDelProducto.lastIndexOf('o');
        System.out.println("Ultima Ocurrencia O: " + ultimoOcurrenciaO);
        String categoria = cadena.substring(33,44);
        System.out.println ("Precio y categoria: "  + precio + " " + categoria);
        String subcadena = nombreDelProducto.substring(7,18);
        System.out.println ("Subcadena desde la posicion 7 : " + subcadena);

    }
}