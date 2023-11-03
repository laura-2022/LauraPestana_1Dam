import java.util.Scanner;

public class Metodos17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el ancho del rectángulo (número entero):");
        int ancho = scanner.nextInt();

        System.out.println("Ingresa el alto del rectángulo (número entero):");
        int alto = scanner.nextInt();

        System.out.println("Ingresa el carácter para el rectángulo:");
        char caracter = scanner.next().charAt(0);

        // Llamamos a la función rectangulo con los valores ingresados
        System.out.println(rectangulo(ancho, alto, caracter));  

        scanner.close();
    }

    // Función para imprimir el rectángulo
    public static String rectangulo(int ancho, int alto, char caracter) {
    	String resultado="";
        // Usamos dos bucles for para controlar las filas y columnas
        for (int i = 0; i < alto; i++) {  // Este bucle recorre las filas
            for (int j = 0; j < ancho; j++) {  // Este bucle recorre las columnas
                // En cada iteración de los bucles, imprimimos el carácter
                 resultado+=caracter+" ";
            }
            // Al final de cada fila, hacemos un salto de línea para pasar a la siguiente fila
            resultado+="\n";
        }
		
		return resultado;
    }
}
