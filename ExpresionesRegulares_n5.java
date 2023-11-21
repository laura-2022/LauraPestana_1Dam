package app.build.classes.java.main.com.laurapestana.tema6;
import java.util.Scanner;
public class ExpresionesRegulares_n5 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.println("\nEjercicio 5:");
		        System.out.print("Ingresa una frase: ");
		        String frase = scanner.nextLine();
		    
		        palabraMasLarga(frase);
		        


		}

		    private static void palabraMasLarga(String frase) {
		        String[] palabras = frase.split(" ");
		    ;
		        String palabraMasLarga = "";

		        for (int i = 0; i < palabras.length; i++) {
		            if (palabras[i].length() > palabraMasLarga.length()) {
		                palabraMasLarga = palabras[i];
		            }
		        }
		       

		        System.out.println("Palabra más larga: " + palabraMasLarga);
		        System.out.println("Número de caracteres: " + palabraMasLarga.length());
		    }

		
}