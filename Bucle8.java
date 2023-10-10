//Escribe un programa que calcule el factorial de un número. Ejemplo:
//5! = 5 * 4 * 3 * 2 * 1 = 120
import java.util.Scanner;
public class Bucle8{
   public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para calcular su factorial!");
        int num = entrada.nextInt();
        int factorial = 1;
        for(int i = 1; i <num; i++){
           factorial = factorial * (i+1);
        }
        System.out.println("El numero factorial del numero: "+num+" es: "+factorial);
    
                                         
    
	}
}

     