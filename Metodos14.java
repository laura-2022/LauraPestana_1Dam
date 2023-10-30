import java.util.Scanner;

/*
https://matemathweb.com/algebra/numero-combinatorio/
La fórmula se evaluará de la siguiente manera:
C(7, 3) = 7! / (3! * (7 - 3)!)
C(7, 3) = 7! / (3! * 4!)
Calculamos los factoriales:
7! = 7 x 6 x 5 x 4 x 3 x 2 x 1 = 5040
3! = 3 x 2 x 1 = 6
4! = 4 x 3 x 2 x 1 = 24
Entonces:
C(7, 3) = 5040 / (6 * 24) = 35
Hay 35 formas diferentes de elegir 3 elementos de un conjunto de 7 elementos.*/
import java.util.Scanner;

public class Metodos14 {
	
    public static final String RESET = "\u001B[0m";
    public static final String BGAZUL = "\u001B[44m";
	
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println(BGAZUL + "** COMBINATORIO**" + RESET);
        System.out.print("Ingrese el valor de n: ");
        int n = lector.nextInt();
        System.out.print("Ingrese el valor de m: ");
        int m = lector.nextInt();

        long resultado = combinatorio(n, m);
        System.out.println("El número combinatorio (" + n + ", " + m + ") es " + resultado);
    }
//DEBERIA UTILIZARSE BIGINTEGER
    // Método para calcular el factorial de un número
    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Método para calcular el número combinatorio n sobre m
    public static long combinatorio(int n, int m) {
        if (n < m) {
            return 0;
        }
        long numerador = factorial(n);
        long denominador = factorial(m) * factorial(n - m);
        return numerador / denominador;
    }
}
