package com.laurapestana.prg3.tema06;

import java.util.Scanner;

public class Ejercicio12 {

	public Ejercicio12() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ejercicio 12:");

		String cadenaOriginal = "esto1234es5678bueno900";

		// Llamamos a los métodos de sustitución y almacenamos los resultados
		String resultadoTexto = sustituirTexto(cadenaOriginal);
		String resultadoDigitos = sustituirDigitos(cadenaOriginal);

		// Imprimimos los resultados en la consola
		System.out.println("Texto original: " + cadenaOriginal);
		System.out.println("Texto sustituido: " + resultadoTexto);
		System.out.println("Dígitos sustituidos: " + resultadoDigitos);
	}

	// Método para sustituir todas las ocurrencias de "es" por "no por"
	public static String sustituirTexto(String cadena) {
		// Utilizamos el método replaceAll de la clase String
		// La expresión "es" es lo que queremos buscar, y "no por" es por lo que lo
		// queremos reemplazar
		return cadena.replaceAll("es", "no por");
	}

	// Método para sustituir todos los grupos de dígitos por un único carácter "*"
	public static String sustituirDigitos(String cadena) {
		// Utilizamos el método replaceAll de la clase String
		// La expresión regular "\\d+" significa uno o más dígitos
		// Lo reemplazamos por el carácter "*"
		return cadena.replaceAll("\\d+", "*");
	}
}
