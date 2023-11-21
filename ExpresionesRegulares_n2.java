package app.build.classes.java.main.com.laurapestana.tema6;
import java.util.Scanner;
public class ExpresionesRegulares_n2 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("\nEjercicio 2:");
		        System.out.print("Ingresa una frase: ");
		        String frase = scanner.nextLine();
		        contarVocalesConsonantes(frase);

		        


		
		

		  

		}

		    private static void contarVocalesConsonantes(String frase) {
		        int vocales = 0;
		        int consonantes = 0;

		        for (int i = 0; i < frase.length(); i++) {
		            char c = Character.toLowerCase(frase.charAt(i));
		            if (c >= 'a' && c <= 'z') {
		                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		                    vocales++;
		                } else {
		                    consonantes++;
		                }
		            }
		        }

		        System.out.println("Número de vocales: " + vocales);
		        System.out.println("Número de consonantes: " + consonantes);
		    }


		
}