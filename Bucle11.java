//Escribe un programa que solicite números hasta que se teclee un 0, mostrar la suma de todos los números introducidos

import java.util.Scanner;
public class Bucle11{
   public static void main(String[] args) {
       
          Scanner lector = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese números enteros. Ingrese un número negativo para calcular la media.");

        while (true) {
            numero = lalumnlector.nextInt();

            if (numero < 0) {
                break; // Salir del bucle si se ingresa un número negativo
            }

            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números válidos para calcular la media.");
        }
    }
}