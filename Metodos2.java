import java.util.Scanner;

public class Metodos2 {

    // Códigos ANSI para colores
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
	public static final String BGAZUL="\u001B[44m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double area = calcularAreaCircunferencia(radio);
        double longitud = calcularLongitudCircunferencia(radio);
        
		System.out.println(BGAZUL+"**CIRCUNFERENCIA **"+RESET);

        System.out.print("El área de la circunferencia es: ");
        System.out.println(GREEN + String.format("%.2f cm2", area) + RESET);

        System.out.print("La longitud de la circunferencia es: ");
        System.out.println(RED + String.format("%.2f cm", longitud) + RESET);
    }

    // Método para calcular el área de la circunferencia
    public static double calcularAreaCircunferencia(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular la longitud de la circunferencia
    public static double calcularLongitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
}
