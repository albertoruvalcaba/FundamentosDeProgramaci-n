import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. CALCULAR EL PROMEDIO DE UNA SERIE DE NUMEROS

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("¿De cuantas materias desea calcular promedio?: ");
        int cant = sc.nextInt();
        System.out.println("Ingrese las calificaciones para sacar el promedio: ");
        for (int i = 0; i < cant; i++) {
            numeros.add(sc.nextInt());
        }
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double promedio = suma / numeros.size();
        System.out.println("El promedio es: " + promedio);
        if (promedio > 7) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Reprobado.");
        }

        //2. CONTAR PARES E IMPARES

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> conteo = new ArrayList<Integer>();
        System.out.println("¿Cuantos numeros desea ingresar?: ");
        int num = input.nextInt();
        System.out.println("Ingrese los numeros de forma aleatoria porfavor: ");
        for (int i = 0; i < num; i++) {
            conteo.add(input.nextInt());
        }
        int pares = 0;
        int impares = 0;
        for (int numero : conteo) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Hay " + pares + " numeros de pares.");
        System.out.println("Hay " + impares + " numeros de impares.");


        //3. SERIE FIBONACCI HASTA N

        Scanner fibo = new Scanner(System.in);
        System.out.println("Introduce cuandos terminos de la serie Fibonacci: ");
        int c = fibo.nextInt();
        if (c <= 0) {
            System.out.println("Por favor ingrese un numero mayor que 0");
        } else {
            int a = 1, b = 1;
            int cont = 1;
            System.out.println("Serie Fibonacci: ");
            while (cont <= c) {
                System.out.println(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
                cont++;
            }
            System.out.println();
        }


        //4. NUMEROS PRIMOS

        Scanner primos =  new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = primos.nextInt();
        boolean esPrimo = true;
        if (number <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println("El numero " + number + " es primo.");
        } else {
            System.out.println("El numero " + number + " no es primo.");
        }


        //5. MUESTRA LOS DIVISORES DE UN NUMERO

        Scanner divs = new Scanner(System.in);
        System.out.println("Introduce un numero del cual desee obtener sus divisores: ");
        int nu = divs.nextInt();
        boolean primo = true;
        if (nu <= 1) {
            primo = false;
            System.out.println("Este numero no cuenta con divisores aparte de 1 y el mismo.");
        } else {
            for (int i = 2; i <= Math.sqrt(nu); i++) {
                if (nu % i == 0) {
                    primo = false;
                    System.out.println("Divisores de " + nu + ":");
                    for (int j = 1; j <= nu; j++) {
                        if (nu % j == 0) {
                            System.out.println(j);
                        }
                    }
                }
                break;
            }
        }



        //6. VERIFICA SI UN NUMERO ES PALINDROMO

        Scanner pal = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numPal = pal.nextInt();
        String numeroStr = Integer.toString(numPal);
        int incioContador = 0;
        int finContador = numeroStr.length() - 1;
        boolean esPalindromo = true;
        while (incioContador < finContador && esPalindromo) {
            if (numeroStr.charAt(incioContador) != numeroStr.charAt(finContador)) {
                esPalindromo = false;
                System.out.println("El numero no es palindromo.");
            } else {
                incioContador++;
                finContador--;
            }
        }
        if (esPalindromo) {
            System.out.println("La numero es palindromo.");
        }


        //7. ADIVINA EL NUMERO

        Scanner adiv = new Scanner(System.in);
        Random rand = new Random();
        int numeroAl = rand.nextInt(100) + 1;
        boolean adivinoNumero = false;
        while (!adivinoNumero) {
            System.out.println("Adivina el numero: ");
            int numeroUsuario = adiv.nextInt();
            if (numeroUsuario == numeroAl) {
                System.out.println("Felicidades");
                adivinoNumero = true;
            } else {
                if (numeroUsuario > numeroAl) {
                    System.out.println("El numero que tienes que adivinar es menor.");
                } else {
                    System.out.println("El numero que tienes que adivinar es mayor.");
                }
            }
        }


        //8. TABLAS DE MULTIPLICAR PERSONALIZADAS

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el numero del que desea su tabla de multiplicar: ");
        int numeroDeseado = in.nextInt();
        System.out.println("Ingrese hasta donde desea el rango: ");
        int rango = in.nextInt();
        int cont = 1;
        while (cont <= rango) {
            String texto = numeroDeseado + " * " + cont;
            int multiplicacion = numeroDeseado * cont;
            System.out.println(texto + " = " + multiplicacion);
            cont++;
        }


        //9. ORDENAR TRES NUMEROS

        Scanner orden = new Scanner(System.in);
        ArrayList<Integer> listaOrden = new ArrayList<Integer>(3);
        System.out.println("Ingrese tres numeros diferentes: ");
        for (int i = 0; i < 3; i++) {
            listaOrden.add(orden.nextInt());
        }
        int a = listaOrden.get(0);
        int b = listaOrden.get(1);
        int e = listaOrden.get(2);
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > e) {
            temp = a;
            a = e;
            e = temp;
        }
        if (b > e) {
            temp = b;
            b = e;
            e = temp;
        }
        System.out.println("Numeros ordenados de menor a mayor: " + a + ", " + b + ", " + e);

    }
}