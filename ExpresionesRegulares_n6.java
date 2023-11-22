package app.build.classes.java.main.com.laurapestana.tema6;
import java.util.Scanner;
public class ExpresionesRegulares_n6 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		                System.out.print("Ingresa una frase: ");
		                String frase = scanner.nextLine();

		                System.out.print("Ingresa el factor de multiplicación: ");
		                int factor = scanner.nextInt();

		                repetirFrase(frase, factor);
		            }

		            private static void repetirFrase(String frase, int factor) {
		                for (int i = 0; i < factor; i++) {
		                    System.out.println(frase);
		                }
		            }

		
}