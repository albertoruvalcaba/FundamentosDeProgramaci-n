import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Numeros Positivos
        int arreglo[]= {-5,-9,-6,5,4,7,-7};

        imprimirPositivos(arreglo);
    }
    public static void imprimirPositivos(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]>0) {
                System.out.print("Numeros positivos: " + arreglo[i]);
            }
        }
    }
}