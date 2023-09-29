import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
      doublke precio;
        double num2;
        int descuento;
	double total;



        double res; // Cambiamos a double para permitir decimales

        Scanner lector = new Scanner(System.in);
        System.out.println("Dime el precio del zapato");
       precio = lector.nextDouble(); // Corregimos nexDouble a nextDouble

        System.out.println("Dime descuento");
        descuento = lector.nextInt(); // Corregimos nexDouble a nextDouble

        System.out.println("El precio de los zapatos es = ");
        op = lector.next().charAt(0); // Corregimos nextChar a next().charAt(0) para leer un solo carácter

        if (op == 'S' || op == 's') { // Cambiamos a minúsculas para comparar correctamente
	//codigo para la suma
            res = num1 + num2;
        } else if (op == 'R' || op == 'r') { // Cambiamos a minúsculas para comparar correctamente
	//codigo para la resta
            res = num1 - num2;
        } else if (op == 'M' || op == 'm') { // Cambiamos a minúsculas para comparar correctamente
	//codigo para la multiplicacion
            res = num1 * num2;
        } else if (op == 'D' || op == 'd') { // Cambiamos a minúsculas para comparar correctamente
	//codigo para la divinas

            if (num2 != 0) { 
                res = num1 / num2;
            } else {
                System.out.print("Error: División por cero no permitida");
                return; // Salir del programa si hay división por cero
            }
        } else {
            System.out.print("NO corresponde con operacion válida");
            return; // Salir del programa si la operación no es válida
        }

        System.out.println("El resultado de la operación con los dos números es: " + res);
        lector.close();
    }
}