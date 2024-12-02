import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class unidimensionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        // 1.
        System.out.println("-----1. Promedio y calificaciones-----");
        int[] calif = new int[10];
        int suma = 0;
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < calif.length; i++) {
            System.out.println("Ingresa las calificaciones: ");
            calif[i] = sc.nextInt();
            suma += calif[i];
        }
        double promedio = suma / calif.length;

        for (int i = 0; i < calif.length; i++) {
            if (calif[i] > promedio) {
                mayor++;
            }else {
                menor++;
            }
        }
        System.out.println("El promedio es: " + promedio);
        System.out.println("Alumnos arriba del promedio: " + mayor);
        System.out.println("Alumnos debajo del promedio: " + menor);

        // 2.
        System.out.println("\n-----2. Numero Mayor y Menor-----");
        int n[] = new int[15];
        int m = 0;
        int men = 0;

        System.out.print("Numeros: ");
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(100);
            System.out.print(n[i] + " ");
        }
        for (int i = 0; i < n.length; i++) {
            if (m < n[i]) {
                m =n[i];
            }else if (men > n[i]) {
                men =n[i];
            }
        }
        System.out.println("\nMayor: " + m);
        System.out.println("Menor: " + men);

        // 3.
        System.out.println("\n-----3. Frecuencia de Elementos-----");
        int arreglo[] = {8,4,8,9,8,4,8,9};
        boolean[] b = new boolean[arreglo.length];

        for(int i = 0; i < arreglo.length; i++){
            if(!b[i]){
                int veces = 1;
                for(int j = i+1; j <arreglo.length; j++){
                    if(arreglo[i]== arreglo[j]){
                        veces++;
                        b[j] = true;
                    }
                }
                System.out.println("El numero " + arreglo[i] + " aparece " + veces + " veces");
            }
        }

        //4.
        System.out.println("\n-----4. Reversa de Arreglo-----");
        int arr[] = new int[10];

        System.out.print("Arreglo original: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + ",");
        }
        System.out.print("\nArreglo invertido: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }

        // 5.
        System.out.println("\n-----5. Arreglo Palindromo-----");
        System.out.println("Ingresa texto: ");
        String texto = sc.nextLine();
        char[] arreg = texto.toCharArray();
        String original = "";
        String reverso = "";

        for (int i = 0; i < arreg.length; i++) {
            original = String.valueOf(arreglo[i]);
        }
        for (int i = texto.length() - 1; i >= 0; i--) {
            reverso = String.valueOf(arreglo[i]);
        }
        if (original.equals(reverso)) {
            System.out.println("El texto es palindromo");
        } else {
            System.out.println("El texto no es palindromo");
        }
    }
}