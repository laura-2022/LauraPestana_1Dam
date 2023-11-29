package com.laurapestana.prg3.tema06;
 import java.util.Scanner;
public class Ejercicio16 {
	
	public static Scanner scanner = new Scanner(System.in);

	public Ejercicio16() {
		String mensaje = "la casa es blanca y fea";
		mensaje.toCharArray();

		System.out.println("Ejercicio 16:");

		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ejercicio 16:");

		// Crear un array de 30 notas de 0 a 10 en decimal
		float[] array = new float[30];

		// Rellenar el array
		array = rellenarArray(scanner);

		// Imprimir el array
		System.out.println("Notas ingresadas:");
		System.out.println(ImprimirArray(array));

		// Calcular y mostrar la media de todas las notas
		float mediaTotal = CalculaMediaNotasTotal(array);
		System.out.println("La media de todas las notas es: " + mediaTotal);

		// Calcular y mostrar la media de las notas mayores a 5
		float mediaMayor5 = CalculaMediaNotasMayor5(array);
		System.out.println("La media de las notas mayores a 5 es: " + mediaMayor5);

		// Cerrar el scanner
		scanner.close();
	}

	// Método para imprimir el array
	private static String ImprimirArray(float[] array) {
		StringBuilder sb = new StringBuilder();
		for (float nota : array) {
			sb.append(nota).append(" ");
		}
		sb.append("\n"); // Salto de línea al final para mejorar la presentación
		return sb.toString();
	}

	// Método para rellenar el array
	private static float[] rellenarArray(Scanner scanner) {
		float[] array = new float[30];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Ingrese la nota en la posición " + (i + 1) + ": ");
			array[i] = scanner.nextFloat();
		}
		return array;
	}

	// Método para calcular la media de todas las notas
	private static float CalculaMediaNotasTotal(float[] array) {
		float suma = 0;
		for (float nota : array) {
			suma += nota;
		}
		return suma / array.length;
	}

	// Método para calcular la media de las notas mayores a 5
	private static float CalculaMediaNotasMayor5(float[] array) {
		int contadorNotasMayor5 = 0;
		float sumaNotasMayor5 = 0;

		for (float nota : array) {
			if (nota > 5) {
				sumaNotasMayor5 += nota;
				contadorNotasMayor5++;
			}
		}

		// Verificar si hay al menos una nota mayor a 5 antes de calcular la media
		if (contadorNotasMayor5 > 0) {
			return sumaNotasMayor5 / contadorNotasMayor5;
		} else {
			// No hay notas mayores a 5, devolver 0 o algún valor indicativo
			return 0;
		}
	}
}