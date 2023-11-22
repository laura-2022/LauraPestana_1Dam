package app.build.classes.java.main.com.laurapestana.tema6;
import java.util.Scanner;
public class ExpresionesRegulares_n7 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Ingresa una frase: ");
		        String frase = scanner.nextLine();

		        mostrarPalabrasEnLineas(frase);
		    }

		    private static void mostrarPalabrasEnLineas(String frase) {
		        String[] palabras = frase.split(" ");

		        for (String palabra : palabras) {
		            System.out.println(palabra);
		        }
		    }
}