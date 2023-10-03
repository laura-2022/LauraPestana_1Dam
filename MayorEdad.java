/*

1.º DAM - Programación Ejercicios
Ejercicios Tema 3. Estructuras condicionales
3. pedir edad e indicar si es mayor de edad;
*/
import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
		int edad;

      System.out.println("Dime u tu edad y te dire si eres mayor o menor de edad ");
        edad = Integer.parseInt(lector.nextLine());
        

        lector.close(); // cierro scanner
  

        if (edad>=18) {
                 System.out.println("eres mayor de edad");

        } else  {
                 System.out.println("eres menor de edad");
        }


      
    }
}

