import java.util.Scanner;

public class Bucle9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numero = 0;
        boolean primo = true;

        System.out.println("Dime un número: ");
        numero = Integer.parseInt(lector.nextLine()); // Lee como int

        if (numero == 0 || numero == 1 || numero == 4) {
            primo = false;
        } else {
            for (int x = 2; x <= numero / 2; x++) {
                // Si es divisible por cualquiera de estos números, no es primo
                if (numero % x == 0) {
                    primo = false;
                    break; // Salir del bucle tan pronto como se detecte que no es primo
                }
            }
        }

        if (primo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número NO es primo.");
        }
    }
}
