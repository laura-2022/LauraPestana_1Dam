import java.util.Scanner;
import java.util.Random;

public class Metodos12 {

    public static void main(String[] args) {
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m";
        final String BGAZUL = "\u001B[44m";

        Scanner lector = new Scanner(System.in);

        System.out.println(BGAZUL + "** 50 notas y sus EQUIVALENTES **" + RESET);

        Random random = new Random();

        // Generar 50 calificaciones al azar y mostrar su equivalente alfabético
        for (int i = 1; i <= 50; i++) {
            double nota = random.nextDouble() * 10; // Generar una nota entre 0 y 10 de manera aleatoria
            String equivalente = calcularEquivalente(nota);
            System.out.printf("Nota " + i + " : %.2f - Calificación: %s%n", nota, equivalente);
        }
    }

    // Función para calcular el equivalente alfabético a la nota
    public static String calcularEquivalente(double nota) {
        if (nota < 5) {
            return "INSUFICIENTE";
        } else if (nota < 6) {
            return "SUFICIENTE";
        } else if (nota < 7) {
            return "BIEN";
        } else if (nota < 9) {
            return "NOTABLE";
        } else {
            return "EXCELENTE";
        }
    }
}
