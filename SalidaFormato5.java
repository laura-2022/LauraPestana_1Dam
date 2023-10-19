import java.util.Scanner;

public class SalidaFormato5 {
    public static void main(String[] args) {
        int filas = 9; // Número de filas

        for (int i = 1; i <= filas; i++) {
            // Seleccionamos un color diferente para cada fila
            String codigoColor = "\u001B[" + (30 + (i % 7)) + "m";

            // Imprimimos el color y el contenido en una sola línea
            System.out.printf(codigoColor + "%" + (filas - i + 1) + "s", "");
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", j);
            }

            // Restauramos el color por defecto (Blanco) en la misma línea
            System.out.print("\u001B[37m");

            // Cambiamos de línea para la siguiente fila
            System.out.println();
        }
    }
}
