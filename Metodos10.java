import java.util.Scanner;

public class Metodos10 {
    public static void main(String[] args) {
		 final String RESET = "\u001B[0m";
		 final String GREEN = "\u001B[32m";
		 final String BGAZUL = "\u001B[44m";
		
        Scanner lector = new Scanner(System.in);
                
        System.out.println(BGAZUL + "** TABLAS DE MULTIPLICAR **" + RESET);
        System.out.println("Ingrese un número para ver su tabla de multiplicar (ingrese un número negativo para salir):");
        int numero = lector.nextInt();
        
        while (numero >= 0) {
            imprimirTablaMultiplicar(numero);
            
            System.out.println("Ingrese otro número (ingrese un número negativo para salir):");
            numero = lector.nextInt();
        }
        
        System.out.println("Programa finalizado.");
        lector.close();
    }
    
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
