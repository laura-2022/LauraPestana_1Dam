/*

1.º DAM - Programación Ejercicios
Ejercicios Tema 3. Estructuras condicionales
3. Ordenar los 2 numeros solicitados de menor a mayor
*/
import java.util.Scanner;

public class Ordenar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
		double num1;
		double num2;

      System.out.println("Dime el primer numero ");
        num1 = Double.parseDouble(lector.nextLine());
              System.out.println("Dime el segundo numero ");
        num2 = Double.parseDouble(lector.nextLine());
        

        lector.close(); // cierro scanner
  

       
        if (num1 == num2) {
			           System.out.println("El orden  de menor a mayor es el siguiente: ");

           System.out.println(num1);
		   System.out.println(num2);

        } else if (num1 < num2) {
			           System.out.println("El orden  de menor a mayor es el siguiente: ");

           System.out.println(num1);
		   System.out.println(num2);
        } else {
			           System.out.println("El orden  de menor a mayor es el siguiente: ");

            
		   System.out.println(num2);
		     System.out.println(num1);
        }
		
		


      
    }
}

