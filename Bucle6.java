import java.util.Scanner;

public class Bucle6 {
    public static void main(String[] args) {
  
		   Scanner lector = new Scanner(System.in);


        System.out.println("------------Muestra tabla de 1-10 --------------------");

		int numero;
        do {
            System.out.print("Ingresa un número entre 1 y 10: ");
            numero = lector.nextInt();
        } while (numero < 1 || numero > 10); //comprobar que sea el rango

        // Mostrar la tabla de multiplicar del número ingresado
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        lector.close(); // Cerrar el scanner
	}
}