

import java.util.Scanner;
public class SalidaFormato4{
    public static void main(String[] args) {
        int filas = 9; // Número de filas

        // Bucle para recorrer cada fila
        for (int i = 1; i <= filas; i++) {
            // Utilizamos printf para imprimir números alineados a la izquierda
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", j);
            }

            // Cambiamos de línea para la siguiente fila
            System.out.println();
        }
    }
}









