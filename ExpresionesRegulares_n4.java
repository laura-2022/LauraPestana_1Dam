package app.build.classes.java.main.com.laurapestana.tema6;
import java.util.Scanner;
public class ExpresionesRegulares_n4 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.println("\nEjercicio 4:");
		        System.out.print("Ingresa una frase: ");
		        String frase = scanner.nextLine();
		        contarPalabra(frase);
  

		}
		    public static void contarVocalesConsonantesPorPalabra(String frase) {
		        // Dividir la frase en palabras
		        String[] palabras = frase.split(" ");

		        // Procesar cada palabra
		        for (String palabra : palabras) {
		            contarPalabra(palabra);
		        }
		    }

		    public static void contarPalabra(String palabra) {
		        int vocales = 0;
		        int consonantes = 0;

		        palabra = palabra.toLowerCase();

		        for (int i = 0; i < palabra.length(); i++) {
		            char c = palabra.charAt(i);

		            if (esVocal(c)) {
		                vocales++;
		            } else if (Character.isLetter(c)) {
		                consonantes++;
		            }
		        }

		        // Mostrar el resultado para cada palabra
		        System.out.println("Palabra: " + palabra);
		        System.out.println("Número de vocales: " + vocales);
		        System.out.println("Número de consonantes: " + consonantes);
		        System.out.println("-------------------------"); // Separador entre palabras
		    }

		    private static boolean esVocal(char c) {
		        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
		    }
}
