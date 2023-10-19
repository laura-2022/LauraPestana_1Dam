//Escribe un programa que solicite un número real al usuario y lo muestre con 2 decimales.

import java.util.Scanner;
public class SalidaFormato1{

    public static void main(String[] args) {
		
		
		Scanner lector=new Scanner(System.in);
		double num;
		
		System.out.print("Dime un numero real para que puieda cambiarle erl formato a 2 decimales");
		num=lector.nextDouble();
		
		System.out.printf("El numero devuelto es %.2f\n", num);

		
		
        /*
			EJEMPLOS
		
		double x = 0.2;
        double y = 0.1;
        int valor = 3;
        double test = 10.456;
        double result = x + y;
		String fondoamarillo="\u001B[32;43m";
		String reset="\u001B[0m";
		
        System.out.printf("%06.3f + %.3f = %.4f%n", x, y, result);
        System.out.printf("El valor %d%n", valor);
        System.out.printf("El valor de test es %.2f%n", test);
		System.out.printf(fondoamarillo+"HOLA" +reset);
*/
    }
}