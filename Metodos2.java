import java.util.Scanner;
public class Metodos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double area = calcularAreaCircunferencia(radio);
        double longitud = calcularLongitudCircunferencia(radio);

        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
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
