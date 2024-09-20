//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int LimiteMayor = 100, LimiteMenor = 1;

        // Lista de Numeros Aleatorios

        double numeroAleatorioUno = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioDos = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioTres = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioCuatro = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioCinco = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioSeis = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioSiete = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioOcho = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioNueve = Math.random() * (LimiteMayor - LimiteMenor + 1);
        double numeroAleatorioDiez = Math.random() * (LimiteMayor - LimiteMenor + 1);

        // Raiz cuadrada de los numeros Aleatorios

        double RaizUno = Math.sqrt(numeroAleatorioUno);
        double RaizDos = Math.sqrt(numeroAleatorioDos);
        double RaizTres = Math.sqrt(numeroAleatorioTres);
        double RaizCuatro = Math.sqrt(numeroAleatorioCuatro);
        double RaizCinco = Math.sqrt(numeroAleatorioCinco);
        double RaizSeis = Math.sqrt(numeroAleatorioSeis);
        double RaizSiete = Math.sqrt(numeroAleatorioSiete);
        double RaizOcho = Math.sqrt(numeroAleatorioOcho);
        double RaizNueve = Math.sqrt(numeroAleatorioNueve);
        double RaizDiez = Math.sqrt(numeroAleatorioDiez);

        // Elevamos al cuadrado

        double PotenciaUno = Math.pow(numeroAleatorioUno, 2);
        double PotenciaDos = Math.pow(numeroAleatorioDos, 2);
        double PotenciaTres = Math.pow(numeroAleatorioTres, 2);
        double PotenciaCuatro = Math.pow(numeroAleatorioCuatro, 2);
        double PotenciaCinco = Math.pow(numeroAleatorioCinco, 2);
        double PotenciaSeis = Math.pow(numeroAleatorioSeis, 2);
        double PotenciaSiete = Math.pow(numeroAleatorioSiete, 2);
        double PotenciaOcho = Math.pow(numeroAleatorioOcho, 2);
        double PotenciaNueve = Math.pow(numeroAleatorioNueve, 2);
        double PotenciaDiez = Math.pow(numeroAleatorioDiez, 2);

        // Imprimimos

        System.out.println("1: " + numeroAleatorioUno);
        System.out.println("La raiz es: " + RaizUno);
        System.out.println("Elevado a la 2: " + PotenciaUno);

        System.out.println("\n2: " + numeroAleatorioDos);
        System.out.println("La raiz es: " + RaizDos);
        System.out.println("Elevado a la 2: " + PotenciaDos);

        System.out.println("\n3: " + numeroAleatorioTres);
        System.out.println("La raiz es: " + RaizTres);
        System.out.println("Elevado a la 2: " + PotenciaTres);

        System.out.println("\n4: " + numeroAleatorioCuatro);
        System.out.println("La raiz es: " + RaizCuatro);
        System.out.println("Elevado a la 2: " + PotenciaCuatro);

        System.out.println("\n5: " + numeroAleatorioCinco);
        System.out.println("La raiz es: " + RaizCinco);
        System.out.println("Elevado a la 2: " + PotenciaCinco);


        System.out.println("\n6: " + numeroAleatorioSeis);
        System.out.println("La raiz es: " + RaizSeis);
        System.out.println("Elevado a la 2: " + PotenciaSeis);

        System.out.println("\n7: " + numeroAleatorioSiete);
        System.out.println("La raiz es: " + RaizSiete);
        System.out.println("Elevado a la 2: " + PotenciaSiete);

        System.out.println("\n8: " + numeroAleatorioOcho);
        System.out.println("La raiz es: " + RaizOcho);
        System.out.println("Elevado a la 2: " + PotenciaOcho);

        System.out.println("\n9: " + numeroAleatorioNueve);
        System.out.println("La raiz es: " + RaizNueve);
        System.out.println("Elevado a la 2: " + PotenciaNueve);

        System.out.println("\n10: " + numeroAleatorioDiez);
        System.out.println("La raiz es: " + RaizDiez);
        System.out.println("Elevado a la 2: " + PotenciaDiez);


        // Calculamos la media

        double Media = (numeroAleatorioUno + numeroAleatorioDos + numeroAleatorioTres + numeroAleatorioCuatro + numeroAleatorioCinco + numeroAleatorioSeis + numeroAleatorioSiete + numeroAleatorioOcho + numeroAleatorioNueve + numeroAleatorioDiez) / 10;
        System.out.println("\nMedia = " + Media);

        // Calculamos la desviacion estandar

        double difMedia = numeroAleatorioUno - Media;
        double difMediaDos = numeroAleatorioDos - Media;
        double difMediaTres = numeroAleatorioTres - Media;
        double difMediaCuatro = numeroAleatorioCuatro - Media;
        double difMediaCinco = numeroAleatorioCinco - Media;
        double difMediaSeis = numeroAleatorioSeis - Media;
        double difMediaSiete = numeroAleatorioSiete - Media;
        double difMediaOcho = numeroAleatorioOcho - Media;
        double difMediaNueve = numeroAleatorioNueve - Media;
        double difMediaDiez = numeroAleatorioDiez - Media;

        double difCUadrado = Math.pow(difMedia, 2);
        double difCuadradoDos = Math.pow(difMediaDos, 2);
        double difCuadradoTres = Math.pow(difMediaTres, 2);
        double difCuadradoCuatro = Math.pow(difMediaCuatro, 2);
        double difCuadradoCinco = Math.pow(difMediaCinco, 2);
        double difCuadradoSeis = Math.pow(difMediaSeis, 2);
        double difCuadradoSiete = Math.pow(difMediaSiete, 2);
        double difCuadradoOcho = Math.pow(difMediaOcho, 2);
        double difCuadradoNueve = Math.pow(difMediaNueve, 2);
        double difCuadradoDiez = Math.pow(difMediaDiez, 2);

        double Varianza = (difCUadrado + difCuadradoDos + difCuadradoTres + difCuadradoCuatro + difCuadradoCinco + difCuadradoSeis + difCuadradoSiete + difCuadradoOcho + difCuadradoNueve + difCuadradoDiez) / 10;

        double DesviacionEstandar = Math.sqrt(Varianza);
        System.out.println("\nSu Desviacion Estandar es: " + DesviacionEstandar);
    }
}