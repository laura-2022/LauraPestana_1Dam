package com.laurapestana.prg3.tema06;
 import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio18 {
	public static Scanner scanner = new Scanner(System.in);

	public static double estaturaMedia = 1.60;

	public Ejercicio18() {


		System.out.println("Ejercicio 18:");

	
			
		Scanner sc=new Scanner(System.in);
	
		
		
	        // Tamaño de los arrays
	        int nElementos = 10;

	        // Arrays de entrada
	        int[] array_uno = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int[] array_dos = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 100};

	        // Arrays para almacenar resultados
	        int[] array_suma = sumarArrays(array_uno, array_dos, nElementos);
	        double[] array_division = dividirArrays(array_uno, array_dos, nElementos);

	        // Mostrar arrays
	        System.out.println("ARRAY UNO"+mostrarArray(array_uno));
	        System.out.println("ARRAY DOS"+mostrarArray(array_dos));
	        System.out.println("ARRAY SUMA"+mostrarArray(array_suma));
	        System.out.println("ARRAY DIVISION"+mostrarArray(array_division));
	    }
		
	 

	// Función para sumar dos arrays
    public static int[] sumarArrays(int[] array1, int[] array2,int n) {
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = array1[i] + array2[i];
        }
        return resultado;
    }

    // Función para dividir elementos de dos arrays
    public static double[] dividirArrays(int[] array1, int[] array2, int n) {
        double[] resultado = new double[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = (double) array1[i] / array2[i];
        }
        return resultado;
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
	
	
}

