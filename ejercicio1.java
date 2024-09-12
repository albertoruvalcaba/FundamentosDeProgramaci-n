import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Esta es una variable de tipo String (Cadena)
        String nombre = "Alberto";

        // Variable de tipo int (número)
        int edad = 18;

        // Variable de tipo char (Caracter)
        char genero = 'H';

        // Variable de tipo Double (decimal)
        Double estatura = 1.88;

        // Variable de tipo boolean (boleana)
        boolean esCasada = true;

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(genero);
        System.out.println(estatura);
        System.out.println(esCasada);

        /*
        CONCATENACIÓN (Unir cosas; variables, texto, etc)
         */

        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + edad);
        System.out.println("Mi genero es: " + genero);
        System.out.println("Mi estatura es: " + estatura);
        System.out.println("Mi esCasada es: " + esCasada);

        /*
        Organizar su código en 3 secciones divididas por comentarios

        - Sección 1: Información de un familiar
        - Mostrar:
            Nombre, edad, genero, año de nacimiento y estatura

        - Sección 2: Información de su mascota
        - Mostrar:
            Nombre, edad, raza, color y sexo

        -Sección 3: Información de su pelicula favorita
        -Mostrar:
           Nombre, año de lanzamiento, duración, genero, director

        En la sección 2 y 3 almacenar los datos en variables en la  primera poner
        los datos directamente en el "print"
        */
        // Sección 1
        System.out.println("Nombre Familiar: Simon");
        System.out.println("Edad: 22 años");
        System.out.println("Género: M");
        System.out.println("Año de Nacimiento: 2002");
        System.out.println("Estatura: 1.80m");

        //Sección 2
        String nombreMascota = "Caguamo";
        int edadMascota = 2;
        String razaMascota = "Cane Corso";
        String colorMascota = "Negro";
        char sexoMascota = 'M';

        System.out.println("Nombre de la mascota: " + nombreMascota);
        System.out.println("Edad: " + edadMascota + " años");
        System.out.println("Raza: " + razaMascota);
        System.out.println("Color: " + colorMascota);
        System.out.println("Sexo: " + sexoMascota);

        //Sección 3
        String nombrePelicula = "Interestelar";
        int añoDeLanzamiento = 2014;
        Double duracionPelicula = 2.49;
        String generoPelicula = "Ciencia ficción";
        String directorPelicula = "Christopher Nolan";

        System.out.println("Película: " + nombrePelicula);
        System.out.println("Lanzamiento: " + añoDeLanzamiento);
        System.out.println("Duración: " + duracionPelicula + " horas");
        System.out.println("Género: " + generoPelicula);
        System.out.println("Director: " + directorPelicula);

    }
}
