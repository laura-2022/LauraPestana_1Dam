import java.util.Scanner;

public class Metodos18 {
    static Scanner scanner = new Scanner(System.in);
    static String letra;
    static String dni;

    private static String PedirDni() {
        System.out.println("Ingresa DNI (número):");
        dni = scanner.next();
        return dni;
    }

    private static char devolverLetra(String dni, String letra) {
        int resto = Integer.parseInt(dni) % 23;
        char letradni = letra.charAt(resto);
        return letradni;
    }

    public static void main(String[] args) {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        PedirDni();
        System.out.println("Su NIF es: "+dni + devolverLetra(dni, letra));
    }
}
