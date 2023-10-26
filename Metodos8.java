import java.util.Scanner;

public class Metodos8 {

    public static final String RESET = "\u001B[0m";
    public static final String BGAZUL = "\u001B[44m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(BGAZUL + "** NUMEROS CAPICUA**" + RESET);

        System.out.println("Ingresa número 1: ");
        int num1 = sc.nextInt();
        System.out.println("Ingresa número 2: ");
        int num2 = sc.nextInt();
        System.out.println("Ingresa número 3: ");
        int num3 = sc.nextInt();
        System.out.println("Ingresa número 4: ");
        int num4 = sc.nextInt();

        imprimirSecuenciaYEsCapicua(num1, num2, num3, num4);
    }

    public static void imprimirSecuenciaYEsCapicua(int num1, int num2, int num3, int num4) {
        // Imprime los números dados y sus versiones invertidas uno al lado del otro
        System.out.println("Secuencia: " + num1 + " " + num2 + " " + num3 + " " + num4);
        System.out.println("Invertida: " + num4 + " " + num3 + " " + num2 + " " + num1);

        // Verifica si la secuencia es capicúa
        boolean esCapicua = esCapicua(num1, num2, num3, num4);
        if (esCapicua) {
            System.out.println("La secuencia es capicúa.");
        } else {
            System.out.println("La secuencia no es capicúa.");
        }
    }

    public static boolean esCapicua(int num1, int num2, int num3, int num4) {
        return num1 == num4 && num2 == num3;
    }
}
