import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar datos del usuario
        System.out.println("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Ingresa tu apellido: ");
        String apellido = input.nextLine();

        // Solicitar datos del domicilio
        System.out.println("Ingresa el nombre de tu calle: ");
        String calle = input.nextLine();

        System.out.println("Ingresa el número de tu domicilio: ");
        String numeroDomicilio = input.nextLine();

        System.out.println("Ingresa la colonia: ");
        String colonia = input.nextLine();

        System.out.println("Ingresa la ciudad: ");
        String ciudad = input.nextLine();

        System.out.println("Ingresa el código postal: ");
        String codigoPostal = input.nextLine();

        System.out.println("Ingresa el estado: ");
        String estado = input.nextLine();

        System.out.println("Ingresa el país: ");
        String pais = input.nextLine();

        // Solicitar datos de la educación
        System.out.println("Ingresa el nombre de tu primaria: ");
        String primaria = input.nextLine();

        System.out.println("Ingresa el nombre de tu secundaria: ");
        String secundaria = input.nextLine();

        System.out.println("Ingresa el nombre de tu preparatoria: ");
        String preparatoria = input.nextLine();

        // Solicitar datos del deporte favorito
        System.out.println("Ingresa tu deporte favorito: ");
        String deporteFavorito = input.nextLine();

        System.out.println("¿Cuántos años llevas practicando el deporte? ");
        String añosDeporte = input.nextLine();

        System.out.println("¿Qué posición juegas? ");
        String posicionDeporte = input.nextLine();

        // Mostrar datos ingresados
        System.out.println("\nDatos ingresados");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Domicilio: " + calle + " #" + numeroDomicilio + ", " + colonia + ", " + ciudad + ", " + estado + ", " + pais + ", Código Postal: " + codigoPostal);
        System.out.println("-Educación:");
        System.out.println("  Primaria: " + primaria);
        System.out.println("  Secundaria: " + secundaria);
        System.out.println("  Preparatoria: " + preparatoria);
        System.out.println("Deporte favorito: " + deporteFavorito);
        System.out.println("Años practicando: " + añosDeporte);
        System.out.println("Posición: " + posicionDeporte);
    }
}