package app.build.classes.java.main.com.laurapestana.tema6;
import java.util.Scanner;
public class ExpresionesRegulares_n8 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Ingresa una frase: ");
		        String frase = scanner.nextLine();

		        mostrarPalabrasYLongitudes(frase);
		    }

		    private static void mostrarPalabrasYLongitudes(String frase) {
		        String[] palabras = frase.split(" ");

		        for (String palabra : palabras) {
		            System.out.println(palabra + ": " + palabra.length() + " caracteres");
		        }
		    }
}