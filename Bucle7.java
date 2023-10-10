import java.util.Scanner;
public class Bucle7{
    public static void main(String[] args) {
		Scanner lector=new Scanner (System.in);
		
        double a ; // el primer numero
        int b;    // la potencia aplicada en negativo
		double resultado=0; // declaramos resultado


  System.out.println("Dime numero a (decimal)");
       a=Double.parseDouble(lector.nextLine());//leo como double
	   
       System.out.println("Dime numero b (entero negativo)");
       b=Integer.parseInt(lector.nextLine());// leo como entero
		
		if (b < 0) {
            // Si el exponente es negativo, calculamos el inverso de 'a' y cambiamos el signo de 'b'.
            a = 1 / a;
            b = -b;
        }

		for (int i = 0; i < b; i++) {
             resultado =resultado* a; // Multiplicar 'a' por sí mismo 'b' veces

        }

        System.out.println(a + " elevado a la potencia " + b + " es igual a " + resultado);

        // Cerramos el scanner para liberar recursos.
        lector.close();
    }
}

     