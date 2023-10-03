/*

1.º DAM - Programación Ejercicios
Ejercicios Tema 3. Estructuras condicionales
1. Escribe un programa que solicite al usuario un número e indique si el número introducido es par o
impar
*/
import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

      System.out.println("Dime un  numero y te indicare si es par o impar ");
        int num1 = Integer.parseInt(lector.nextLine());
        

        lector.close(); // cierro scanner
  

        if (num1%2==0) {
                 System.out.println("el numero es par");

        } else  {
                 System.out.println("el numero es impar");
        }


      
    }
}

