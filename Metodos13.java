import java.util.Scanner;

public class Metodos13 {

    public static final String RESET = "\u001B[0m";
    public static final String BGAZUL = "\u001B[44m";

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println(BGAZUL + "** SALUDOS**" + RESET);

        System.out.println("Ingrese su nombre: ");
        String nombre = lector.nextLine();

        System.out.println("Elija el idioma (a para Castellano, b para Italiano, c para Inglés): ");
        char codigoIdioma = lector.next().charAt(0);

        String mensajeSaludo = saludo(nombre, codigoIdioma);
        System.out.println(mensajeSaludo);

        lector.close();
    }

    public static String saludo(String nombre, char codigoIdioma) {
        String mensaje = "";

        switch (codigoIdioma) {
            case 'a':
                mensaje = "Buenos días " + nombre;
                break;
            case 'b':
                mensaje = "Buongiorno " + nombre;
                break;
            case 'c':
                mensaje = "Good morning " + nombre;
                break;
            default:
                mensaje = "Idioma no reconocido";
        }

        return mensaje;
    }
}
