import java.util.Scanner;

public class Metodos7 {

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String BGAZUL = "\u001B[44m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingresa un número: ");
            int num = sc.nextInt();
            int factorial = calcularFactorial(num);

            if (factorial >= 0) {
                System.out.println(BGAZUL + "** FACTORIAL **" + RESET);
                System.out.printf("El factorial del número dado es: %d! = %d%n", num, factorial);
            } else {
                System.out.println("El número es menor que cero. Ingresa un número válido.");
            }
        }
    }

    public static int calcularFactorial(int num) {
        if (num < 0) {
            return -1; // Devolvemos un valor negativo para indicar que el número es inválido
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
