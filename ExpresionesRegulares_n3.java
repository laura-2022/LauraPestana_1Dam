package app.build.classes.java.main.com.laurapestana.tema6;
import java.util.Scanner;
public class ExpresionesRegulares_n3 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("\nEjercicio 3:");
		        System.out.print("Ingresa una frase: ");
		        String frase3 = scanner.nextLine();
		        System.out.println("Número de palabras: " + contarPalabras(frase3));

		        


		
		

		  

		}

		    private static int contarPalabras(String frase) {
		        String[] palabras = frase.split(" ");
		        return palabras.length;
		    }

		
}