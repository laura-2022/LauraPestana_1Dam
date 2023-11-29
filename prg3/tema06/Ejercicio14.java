package com.laurapestana.prg3.tema06;
 import java.util.Scanner;
public class Ejercicio14 {
	public static Scanner scanner = new Scanner(System.in);

	public Ejercicio14() {
		String mensaje = "la casa es blanca y fea";
		mensaje.toCharArray();

		System.out.println("Ejercicio 14:");
		  // Crear un array de caracteres para probar
        char[] miArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g','m','r','h','o','l','a'};

        // Llamar al método e imprimir el resultado
        String resultado = imprimirLetrasPosiPar(miArray);
        System.out.println("Letras en posiciones pares: " + resultado);
        String resultado2 = imprimirLetrasPosiImPar(miArray);
        System.out.println("Letras en posiciones impares: " + resultado2);
	}

//imprimir
	private String imprimirLetrasPosiPar(char[] array) {
	    StringBuilder sb = new StringBuilder(array.length); // Inicializar con tamaño estimado

	    for (int i = 0; i < array.length; i += 2) {
	        sb.append(array[i]).append(" ");
	    }

	    return sb.toString();
	}

	private String imprimirLetrasPosiImPar(char[] array) {
	    StringBuilder sb = new StringBuilder(array.length); // Inicializar con tamaño estimado

	    for (int i = 1; i < array.length; i += 2) {
	        sb.append(array[i]).append(" ");
	    }

	    return sb.toString();
	}
}
