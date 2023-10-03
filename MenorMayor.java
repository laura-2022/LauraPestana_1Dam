1.º DAM - Programación Ejercicios

2. Escribe un programa que solicite al usuario dos números e indique si el primer número introducido
es mayor, menor o igual que el segundo

*/
import java.util.Scanner;

public class MenorMayor{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
		int num1;
		int num2;
		String op;
		

        System.out.println("Dime primer numero ");
        num1 = Integer.parseInt(lector.nextLine());
        System.out.println("Dame segundo numero");
        num2 = Integer.parseInt(lector.nextLine());

lector.close(); // cierro scanner
      

        if (num1 == num2) {
            op = "igual";
        } else if (num1 < num2) {
            op = "menor";
        } else {
            op = "mayor";
        }

        

        System.out.println("el primer numero " + num1 + " es " + op + " al segundo numero ingresado");
    }
}

