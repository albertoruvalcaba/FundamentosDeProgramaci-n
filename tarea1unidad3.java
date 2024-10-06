//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombreCliente = "Carlos Martinez";
        String direccionIP = "192.168.0.1";
        int numeroDeCliente = 12345;

        String nombre = nombreCliente.substring(0, nombreCliente.indexOf(" "));
        String apellido = nombreCliente.substring(nombreCliente.indexOf(" ") + 1);

        String nombreCifrado = nombre.replace('a','1')
                .replace('e','2')
                .replace('i','3')
                .replace('o','4')
                .replace('u','5');

        String apellidoCifrado = apellido.replace('a','1')
                .replace('e','2')
                .replace('i','3')
                .replace('o','4')
                .replace('u','5');

        char primerLetra = nombreCifrado.charAt(0);
        char ultimaLetra = apellidoCifrado.charAt(apellidoCifrado.length() - 1);
        String nombreFinal = nombreCifrado.replace(primerLetra, ultimaLetra);
        String apellidoFinal = apellidoCifrado.replace(ultimaLetra, primerLetra);
        String clienteFinal = nombreFinal + " " + apellidoFinal;

        //System.out.println(clienteFinal);

        String primero = direccionIP.substring(0,3);
        String segundo = direccionIP.substring(4,7);
        String tercero = direccionIP.substring(8,9);
        String cuarto = direccionIP.substring(10);

        String hexUno = Integer.toHexString(Integer.valueOf(primero));
        String hexDos = Integer.toHexString(Integer.valueOf(segundo));
        String hexTres = Integer.toHexString(Integer.valueOf(tercero));
        String hexCuarto = Integer.toHexString(Integer.valueOf(cuarto));
        String ipFinal = hexUno + "." + hexDos + "." + hexTres + "." + hexCuarto;

        //System.out.println(ipFinal);

        int cliente = (Integer.valueOf(numeroDeCliente) * 3 + 15) / 2;
        //System.out.println(cliente);

        System.out.println("Datos cifrados: " + clienteFinal + "|" + ipFinal + "|" + cliente);
    }
}