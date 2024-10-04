//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String correo = "juan.perez@empresa.com";
        String fechaAscenso = "2023-04-15";
        double salario = 50000.75;

        int indiceCorreo = correo.indexOf('@');
        String correoDos = correo.substring(0, indiceCorreo);
        String segundaParte = correo.substring(indiceCorreo);
        String correoInvertido = new StringBuilder(correoDos).reverse().toString();
        String correoFinal = correoInvertido + segundaParte;
        //System.out.println(correoFinal);

        String año = fechaAscenso.substring(0, 4);
        String mes = fechaAscenso.substring(5, 7);
        String dia = fechaAscenso.substring(8);
        int sumaFecha = Integer.valueOf(año) + Integer.valueOf(mes) + Integer.valueOf(dia);
        //System.out.println(sumaFecha);

        String conversion = Double.toString(salario);
        int indiceSalario = conversion.indexOf('.');
        String salarioDos = conversion.substring(0, indiceSalario);
        String segundaParteSalario = conversion.substring(indiceSalario + 1);
        int restaSalario = Integer.valueOf(salarioDos) - Integer.valueOf(segundaParteSalario);
        int multiplicacionSalario = restaSalario * 2;
        //System.out.println(multiplicacionSalario);

        System.out.println(correoFinal + "|" + sumaFecha + "|" + multiplicacionSalario);

    }
}