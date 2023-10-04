/*

1.º DAM - Programación Ejercicios
Ejercicios Tema 3. Estructuras condicionales

*/
import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double nota;

        System.out.println("Dime la nota ");
        nota = Double.parseDouble(lector.nextLine());

        lector.close(); // cierro scanner

        if (nota >= 0 && nota < 5) {
            System.out.println("INSUFICIENTE");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("SUFICIENTE");
        } else if (nota > 6 && nota <= 7) {
            System.out.println("BIEN");
        } else if (nota > 7 && nota <= 9) {
            System.out.println("NOTABLE");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("SOBRESALIENTE");
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 10");
        }
    }
}

