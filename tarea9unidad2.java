import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar puntos

        System.out.println("Ingrese la coordenadas del primer punto: ");
        double xUno = sc.nextDouble();
        double yUno = sc.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo punto: ");
        double xDos = sc.nextDouble();
        double yDos = sc.nextDouble();

        System.out.println("Ingrese las coordenas del tercer punto: ");
        double xTer = sc.nextDouble();
        double yTer = sc.nextDouble();

        // Sacamos la distancia de los tres lados
        // Lado AB

        double ladoAB = Math.sqrt(Math.pow(xDos - xUno, 2) + Math.pow(yDos - yUno, 2));
        System.out.println("Lado A: " + ladoAB);

        // Lado BC

        double ladoBC = Math.sqrt(Math.pow(xDos - xTer, 2) + Math.pow(yDos - yTer, 2));
        System.out.println("Lado B: " + ladoBC);

        // Lado CA

        double ladoCA = Math.sqrt(Math.pow(xUno - xTer, 2) + Math.pow(yUno - yTer, 2));
        System.out.println("Lado C: " + ladoCA);

        // Calculamos Perimetro

        double perimetro = ladoAB + ladoBC + ladoCA;
        System.out.println("Perimetro del triangulo: " + perimetro);

        // Formula de heron (Area)

        double s = (ladoAB + ladoBC + ladoCA) / 2;
        double area = Math.sqrt (s * (s - ladoAB) * (s - ladoBC) * (s - ladoCA));
        System.out.println("Area del tringulo: " + area);

        // Altura del triangulo desde vertice A

        double altura = 2 * area / ladoAB;
        System.out.println("Altura desde el vertice A: " + altura);

        // Angulos internos
        // A

        double internoCosA = Math.pow(ladoBC, 2) + Math.pow(ladoCA, 2) - Math.pow(ladoAB, 2);
        double divisionintCosA = internoCosA / (2 * (ladoBC * ladoCA));
        double cosA = Math.acos(divisionintCosA);
        double anguloA = Math.toDegrees(cosA);
        System.out.println("Angulo A: " + anguloA);

        // B

        double internoCosB = Math.pow(ladoAB, 2) + Math.pow(ladoCA, 2) - Math.pow(ladoBC, 2);
        double divisionintCosB = internoCosB / (2 * (ladoAB * ladoCA));
        double cosB = Math.acos(divisionintCosB);
        double anguloB = Math.toDegrees(cosB);
        System.out.println("Angulo B: " + anguloB);

        // C

        double internoCosC = Math.pow(ladoAB, 2) + Math.pow(ladoBC, 2) - Math.pow(ladoCA, 2);
        double divisionintCosC = internoCosC / (2 * (ladoAB * ladoBC));
        double cosC = Math.acos(divisionintCosC);
        double anguloC = Math.toDegrees(cosC);
        System.out.println("Angulo C: " + anguloC);

        // Diferencia entre longitudes (Trinagulo equilatero?)

        double diferencia = Math.abs(ladoAB - ladoBC) + Math.abs(ladoBC - ladoCA) + Math.abs(ladoCA - ladoAB);
        boolean esEquilatero = (diferencia == 0);

        if (esEquilatero) {
            System.out.println("Es un Triangulo Equilatero");
        }
        else {
            System.out.println("No es un Triangulo Equilatero");
        }

        // Punto medio entre puntos

        double puntoMedioABpUno = (xUno + xDos) / 2, puntoMedioABpDos = (yUno + yDos) / 2;
        System.out.println("Punto Medio AB: " + puntoMedioABpUno + ", " + puntoMedioABpDos);

        double puntoMedioBCpUno = (xDos + xTer) / 2, puntoMedioBCpDos = (yDos + yTer) / 2;
        System.out.println("Punto Medio BC: " + puntoMedioBCpUno + ", " + puntoMedioBCpDos);

        double puntoMedioCApUno = (xUno + xTer) / 2, puntoMedioCApDos = (yUno + yTer) / 2;
        System.out.println("Punto Medio CA: "+ puntoMedioCApUno + ", " + puntoMedioCApDos);
    }
}