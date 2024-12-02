import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class bidimensionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // 1.
        System.out.println("-----1. Suma de Filas y Columnas-----");
        int[][] arreglo = new int[4][4];
        int sumaFila = 0;
        int sumaColumna = 0;

        System.out.println("Matriz original:");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[i][j] = r.nextInt(100);
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                sumaFila += arreglo[i][j];
            }
            System.out.println("La suma de la fila " + i + " es " + sumaFila);
        }
        for (int j = 0; j < arreglo.length; j++) {
            for (int i = 0; i < arreglo[j].length; i++) {
                sumaColumna += arreglo[i][j];
            }
            System.out.println("La suma de la columna " + j + " es " + sumaColumna);
        }

        // 2.
        System.out.println("\n-----2. Buscar el mayor elemento-----");
        int[][] arregl = new int[4][4];
        int mayor = 0;
        int fil = 0;
        int col = 0;

        System.out.println("Matriz: ");
        for (int i = 0; i < arregl.length; i++) {
            for (int j = 0; j < arregl.length; j++) {
                arregl[i][j] = r.nextInt(100);
                System.out.print(arregl[i][j] + " ");
                if (arregl[i][j] > mayor) {
                    mayor = arregl[i][j];
                    fil = i+1;
                    col = j+1;
                }
            }
            System.out.println();
        }
        System.out.println("El numero mayor del arreglo es: " + mayor);
        System.out.println("Esta en la fila: " + fil + " y en la columna " + col);

        // 3.
        System.out.println("\n-----3. Intercambiar filas-----");
        int [][] arreg = new int[4][4];

        System.out.println("Matriz: ");
        for (int i = 0; i < arreg.length; i++) {
            for (int j = 0; j < arreg.length; j++) {
                arreg[i][j] = r.nextInt(100);
                System.out.print(arreg[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("¿Qué filas deseas intercambiar?");
        System.out.println("Fila uno: ");
        int filaUno = sc.nextInt();
        System.out.println("Fila dos: ");
        int filaDos = sc.nextInt();

        int[] temp = arreg[filaUno];
        arreg[filaUno] = arreg[filaDos];
        arreg[filaDos] = temp;

        System.out.println("Nueva matriz");
        for (int i = 0; i < arreg.length; i++) {
            for (int j = 0; j < arreg.length; j++) {
                System.out.print(arreg[i][j] + " ");
            }
            System.out.println();
        }

        // 4.
        System.out.println("-----4. Diagonal principal y secundaria-----");
        int [][] arre = new int[4][4];
        int sumaP = 0;
        int sumaS = 0;

        System.out.println("Matriz: ");
        for (int i = 0; i < arreg.length; i++) {
            for (int j = 0; j < arreg.length; j++) {
                int sec = i+j;
                int secDos = 4-1;
                arre[i][j] = r.nextInt(100);
                System.out.print(arre[i][j] + " ");

                if (i == j){
                    sumaP += arre[i][j];
                }
                if (sec == secDos) {
                    sumaS += arre[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Suma diagonal principal: " + sumaP);
        System.out.println("Suma diagonal secundaria: " + sumaS);

        // 5.
        System.out.println("\n-----5. Transpuesta de una matriz-----");
        int [][] arr = new int[4][4];

        System.out.println("Matriz: ");
        for (int i = 0; i < arreg.length; i++) {
            for (int j = 0; j < arreg.length; j++) {
                arr[i][j] = r.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < arreg.length; i++) {
            for (int j = 0; j < arreg.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}