import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE EVALUACION DE SEGURO MEDICO " + "\n");

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese su Pais de residencia");
        String pais = sc.nextLine();

        System.out.println("Estado civil");
        String estadoCivil = sc.nextLine();

        System.out.println("Ingrese su ingreso anual");
        double ingresoAnual = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("¿Tiene hijos?(si o no)");
        String hijos = sc.nextLine();

        // Validaciones iniciales
        if (nombre.matches(".\\d.")) {
            System.out.println("Error: El nombre de usuario no puede contener números.");
            return;
        }

        if (edad < 25) {
            System.out.println("Error: La edad debe ser mayor que 25.");
            return;
        }

        double precioBase = 500;
        double descuento = 0;

        // Lógica para México
        if (pais.equalsIgnoreCase("mexico")) {
            if (estadoCivil.equalsIgnoreCase("casado")) {
                if (ingresoAnual < 300000) {
                    descuento = hijos.equalsIgnoreCase("si") ? 0.10 : 0.05;
                }
            } else {
                if (ingresoAnual < 400000) {
                    descuento = 0.08;
                }
            }
        }

        // Lógica para USA
        else if (pais.equalsIgnoreCase("usa")) {
            if (estadoCivil.equalsIgnoreCase("soltero")) {
                if (ingresoAnual < 200000) {
                    descuento = 0.07;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                } else if (ingresoAnual < 500000) {
                    // Nuevo caso para solteros con ingreso entre 200000 y 500000
                    descuento = 0.07;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                }
            } else if (estadoCivil.equalsIgnoreCase("casado")) {
                if (ingresoAnual < 500000) {
                    descuento = 0.12;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                }
            }
        }
        // Lógica para otros países
        else {
            if (estadoCivil.equalsIgnoreCase("casado")) {
                descuento = 0.05;
                if (ingresoAnual < 200000) {
                    descuento += 0.02;
                }
            } else {
                descuento = 0.03;
                if (ingresoAnual < 200000) {
                    descuento += 0.02;
                }
            }
        }

        double precioFinal = precioBase * (1 - descuento);

        if (descuento > 0) {
            System.out.printf("Estimado %s, puede reclamar un descuento del %.0f%% en su seguro%n",
                    nombre, descuento * 100);
            System.out.printf("Precio final: $%.2f%n", precioFinal);
        } else {
            System.out.println("Usted no califica para recibir beneficios");
        }

        sc.close();
    }
}