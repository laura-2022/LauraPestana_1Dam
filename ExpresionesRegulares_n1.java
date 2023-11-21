package app.build.classes.java.main.com.laurapestana.tema6;
import java.util.Scanner;
public class ExpresionesRegulares_n1 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.println("Ejercicio 1:");
		        System.out.print("Ingresa una frase: ");
		        String frase = scanner.nextLine();
		        System.out.println("Frase con la primera letra en mayúsculas: " + primeraLetraMayuscula(frase));

		        


		
		

		  

		}

			private static String primeraLetraMayuscula(String frase) {
				
				// TODO Auto-generated method stub
				 return frase.substring(0, 1).toUpperCase() + frase.substring(1);
			}

		
}