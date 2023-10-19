

import java.util.Scanner;
public class SalidaFormato3{
    public static void main(String[] args) {
        int filas = 9; // Número de filas

        for (int i = 1; i <= filas; i++) {
            // Imprimimos espacios en blanco al principio de cada fila
            System.out.printf("%" + (filas - i + 1) + "s", "");

            // Imprimimos números del 1 al número de la fila sin espacios adicionales
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Cambiamos de línea para la siguiente fila
            System.out.println();
        }
    }
}





