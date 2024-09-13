import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Datos de mi familiar

        System.out.print("Ingrese nombre de tu familiar: ");
        String familiar = input.nextLine();
        System.out.print("El nombre de tu familiar es: " + familiar);

        System.out.print("\nIngrese su edad: ");
        String edad = input.nextLine();
        System.out.print("La edad de tu familiar es: " + edad);

        System.out.print("\nIngrese su fecha de nacimiento: ");
        String nacimiento = input.nextLine();
        System.out.print("La fecha de nacimiento de tu familiar es: " + nacimiento);

        System.out.print("\nIngrese su genero: ");
        String genero = input.nextLine();
        System.out.print("Su genero es: " + genero);

        System.out.print("\nIngrese su estatura: ");
        String estatura = input.nextLine();
        System.out.print("Su estatura es: " + estatura);

        // Datos de su mascota

        System.out.print("\nIngrese el nombre de su mascota: ");
        String nombre2 = input.nextLine();
        System.out.print("Su nombre es: " + nombre2);

        System.out.print("\nIngrese su edad: ");
        String edad2 = input.nextLine();
        System.out.print("Su edad es: " + edad2);

        System.out.print("\nIngrese su raza: ");
        String raza = input.nextLine();
        System.out.print("La raza es: " + raza);

        System.out.print("\nIngrese su color: ");
        String color = input.nextLine();
        System.out.print("Su color es: " + color);

        System.out.print("\nIngrese su sexo: ");
        String sexo = input.nextLine();
        System.out.print("Su sexo es: " + sexo);

        // Datos de su pelicula favorita

        System.out.print("\nIngrese el titulo: ");
        String titulo = input.nextLine();
        System.out.print("Su titulo es: " + titulo);

        System.out.print("\nIngrese año de lanzamiento: ");
        String anodelanzamiento  = input.nextLine();
        System.out.print("Su año de lanzamiento fue: " + anodelanzamiento);

        System.out.print("\nIngrese su duracion: ");
        String duracion = input.nextLine();
        System.out.print("Su duracion es: " + duracion);

        System.out.print("\nIngrese el genero: ");
        String genero2 = input.nextLine();
        System.out.print("Su genero es: " + genero2);

        System.out.print("\nIngrese el director de la pelicula: ");
        String director = input.nextLine();
        System.out.print("Su director es: " + director);
        
    }
}