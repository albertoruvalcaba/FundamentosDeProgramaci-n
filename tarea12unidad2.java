//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String direccionCompleta = " Av. Liberador, 1234, Ciudad de México, C.P. 060000";
        System.out.println("Introduce tu direccion completa: " + direccionCompleta);

        // Validacion de longitud
        int longitudDireccion = direccionCompleta.length();
        System.out.println("La longitud de la dirección es: " + longitudDireccion);

        //Extraccion del primer y ultimo caracter
        char empiezaCon = direccionCompleta.charAt(1);
        System.out.println("El primer caracter de su direccion es: " + empiezaCon);

        char terminaCon = direccionCompleta.charAt(50);
        System.out.println("El ultimo caracter de su direccion es: " + terminaCon);

        // Conversion a mayusculas y minusculas
        String nombreMayus = direccionCompleta.toUpperCase();
        System.out.println("Su direccion en mayusculas es: " + nombreMayus);

        String nombreMinus = direccionCompleta.toLowerCase();
        System.out.println("Su direccion en minusculas es: " + nombreMinus);

        // Division en partes
        String Calle = direccionCompleta.substring(1, 14);
        System.out.println("Calle: " + Calle);

        String numero = direccionCompleta.substring(16, 20);
        System.out.println("Numero: " + numero);

        String ciudad = direccionCompleta.substring(21, 38);
        System.out.println("Ciudad: " + ciudad);

        String codigoP = direccionCompleta.substring(45, 51);
        System.out.println("Código Postal: " + codigoP);

        // Busqueda de caracteres
        int posQuince = direccionCompleta.indexOf("1");
        System.out.println("La primera aparicion de un numero esta en la posicion: " + posQuince);

        int totalA = direccionCompleta.length() - direccionCompleta.replace(direccionCompleta, " Av Liberador 1234 Ciudad de Mexico CP 060000").length();
        System.out.println("Dirección corregida: " + direccionCompleta);

        // Eliminacion de espacios
        String direccionSinEspacios = direccionCompleta.trim();
        System.out.println("Dirección sin espacios extras: " + direccionSinEspacios);

        // Generacion de iniciales
        String abreviacion = "Liberador, 1234, México, 060000";
        System.out.println("Version abreviada de la dirección: " + abreviacion);
        
    }
}