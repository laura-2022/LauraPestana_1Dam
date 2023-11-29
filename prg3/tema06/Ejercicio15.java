package com.laurapestana.prg3.tema06;
 import java.util.Scanner;
public class Ejercicio15 {
	
	public static Scanner scanner = new Scanner(System.in);

	public Ejercicio15() {
		String mensaje = "la casa es blanca y fea";
		mensaje.toCharArray();

		System.out.println("Ejercicio 15:");
		  // Crear un array de 20 integers
		Scanner scanner = new Scanner(System.in);

        // Crear un array de 20 números
        int[] numeros = new int[20];

        // Rellenar el array
        numeros = rellenarArray(scanner);

        // Mostrar el array
        System.out.println("Array ingresado:");
        System.out.println(mostrarArray(numeros));

        // Mostrar el array de 4 en 4
        System.out.println("Array de 4 en 4:");
        System.out.println(mostrarArrayDe4en4(numeros));

        // Cerrar el scanner
        scanner.close();
	}

	private static int[] rellenarArray(Scanner scanner) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el número en la posición " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Método para mostrar el array
    private static String mostrarArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int numero : array) {
            sb.append(numero).append(" ");
        }
        sb.append("\n"); // Salto de línea al final para mejorar la presentación
        return sb.toString();
    }

    // Método para mostrar el array de 4 en 4
    private static String mostrarArrayDe4en4(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i += 4) {
            for (int j = i; j < i + 4 && j < array.length; j++) {
                sb.append(array[j]).append(" ");
            }
            sb.append("\n"); // Salto de línea después de cada conjunto de 4 números
        }
        return sb.toString();
    }


}


