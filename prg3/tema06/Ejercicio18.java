package com.laurapestana.prg3.tema06;
 import java.util.Scanner;



		
public class Ejercicio18 {
	Scanner sc = new Scanner(System.in);
	// importante tener funcion que rellene arrays de forma aletoria

	//int final CANTIDAD=10;
	

	public Ejercicio18() {

		// Tamaño de los arrays
		int nElementos = pedirN();

		int[] a1 = generarArrayAleatorio(nElementos, 1, 10);
		int[] a2 = generarArrayAleatorio(nElementos, 1, 10);

		// Arrays de entrada

		int[] array1 = new int[nElementos];
		int[] array2 = new int[nElementos] ;

		// Arrays para almacenar resultados
		int[] array_suma = sumarArrays(a1, a2);
		double[] array_division = dividirArrays(a1, a2);

		// Mostrar arrays
		System.out.println("ARRAY UNO" + mostrarArray(a1));
		System.out.println("ARRAY DOS" + mostrarArray(a2));
		System.out.println("ARRAY SUMA" + mostrarArray(array_suma));
		System.out.println("ARRAY DIVISION" + mostrarArray(array_division));//
		//otra forma de mostrar decimales
		System.out.printf(ArraytoString(array_division, nElementos),2); 
	}

	public static int[] generarArrayAleatorio(int length, int min, int max) {
		if (length < 1) {
			return null;
		}
		if (min > max) {
			return null;
		}
		int[] resultado = new int[length];
		Random random = new Random();
		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = random.nextInt(max - min + 1) + min;
		}
		return resultado;
	}

	private int[] pedirNumeros(int nElementos, int[] array, Scanner sc) {

		for (int i = 0; i < nElementos; i++) {
			System.out.print("Ingrese número la posición " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}
		return array;
	}

	private int pedirN() {
		System.out.println("Dame la cantidad de numeros que ingresaras: ");

		return sc.nextInt();
	}

	// Función para sumar dos arrays
	public static int[] sumarArrays(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return null;
		}
		int[] array_suma = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array_suma[i] = array1[i] + array2[i];
		}
		return array_suma;
	}

	// Función para dividir elementos de dos arrays
	public static double[] dividirArrays(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return null;
		}
		double[] array_dividir = new double[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array_dividir[i] = (double) array1[i] / array2[i];
		}
		return array_dividir;
	}

	// Función para mostrar un array de enteros
	public static String mostrarArray(int[] array) {
		StringBuilder sb = new StringBuilder("\n************\n");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]).append(" ");
		}
		sb.append("\n");
		return sb.toString();
	}

	// Función para mostrar un array de doubles
	public static String mostrarArray(double[] array) {
		StringBuilder sb = new StringBuilder("\n************\n");
		for (int i = 0; i < array.length; i++) {
			sb.append(String.format("% .2f ", array[i]));
		}
		sb.append("\n");
		return sb.toString();
	}
	public static String ArraytoString(double[] array,int numDecimales) {
		StringBuilder sb = new StringBuilder("\n************\n");
		for (int i = 0; i < array.length; i++) {
			sb.append(String.format("% ."+numDecimales+"f ", array[i]));
		}
		sb.append("\n");
		return sb.toString();
	}

}
