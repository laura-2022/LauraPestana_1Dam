import java.util.Scanner;

public class SalidaFormato9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String ESC_ANSI = "\u001b[";
        final String ROJO_ANSI = "\u001b[1;31m";
        final String VERDE_ANSI = "\u001b[1;32m";
        final String AMARILLO_ANSI = "\u001b[1;33m";
        final String AZUL_ANSI = "\u001b[1;34m";
        final String MAGENTA_ANSI = "\u001b[1;35m";
        final String RESET_ANSI = "\u001b[0m";

        // Solicitar los datos al usuario

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.println("Fecha:");
        System.out.print("Día (dd): ");
        int dia = scanner.nextInt();
        System.out.print("Mes (mm): ");
        int mes = scanner.nextInt();
        System.out.print("Año (yyyy): ");
        int año = scanner.nextInt();

        System.out.println("Hora de la medición:");
        System.out.print("Hora (hh): ");
        int hora = scanner.nextInt();
        System.out.print("Minutos (mm): ");
        int minutos = scanner.nextInt();
        System.out.print("Segundos (ss): ");
        int segundos = scanner.nextInt();

        System.out.print("Velocidad del Viento (Km/h): "); // Texto de velocidad de viento en verde
        int velocidadViento = scanner.nextInt();

        System.out.print("Temperatura (°C): "); // Texto de temperatura en amarillo
        double temperatura = scanner.nextDouble();

        System.out.print("Probabilidad de Lluvia (%): "); // Texto de probabilidad de lluvia en rojo
        int probabilidadLluvia = scanner.nextInt();

        System.out.print("Índice de Radiación Ultravioleta (UVI): "); // Texto de UVI en color fucsia
        int uvi = scanner.nextInt();

        scanner.close();

        // Formatear la fecha
        String fechaFormateada = String.format(ESC_ANSI + "0m%02d/%02d/%04d" + RESET_ANSI, dia, mes, año);

        // Formatear la hora de la medida
        String horaFormateada = String.format(ESC_ANSI + "0m%02d:%02d:%02d" + RESET_ANSI, hora, minutos, segundos);

        // Mostrar los datos
        System.out.print(ESC_ANSI + "44m" + ESC_ANSI + "1;30m**Datos de la Estación Meteorológica**" + RESET_ANSI + "\n"); // Título con fondo azul y texto gris en negrita
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Fecha: " + fechaFormateada);
        System.out.println("Hora de la Medida: " + horaFormateada);

        // Mostrar la velocidad del viento con colores
        System.out.println(VERDE_ANSI + "Velocidad del Viento: " + velocidadViento + " Km/h " + RESET_ANSI);

        // Mostrar la temperatura con colores
        String colorTemperatura = AMARILLO_ANSI + temperatura + RESET_ANSI + " °C";
        System.out.println(AMARILLO_ANSI + "Temperatura: " + String.format("%.2f", temperatura) + " °C " + RESET_ANSI);

        // Mostrar la presión atmosférica
        //System.out.println("Presión Atmosférica: " + String.format("%.2f", presion) + " hPa");

        // Mostrar la probabilidad de lluvia con colores
        String colorLluvia = ROJO_ANSI + probabilidadLluvia + RESET_ANSI;
        System.out.println(ROJO_ANSI + "Probabilidad de Lluvia: " + probabilidadLluvia + "% " + RESET_ANSI);

        // Mostrar el índice de radiación ultravioleta con colores
        String colorUVI = MAGENTA_ANSI + "UVI " + uvi + RESET_ANSI;
        System.out.println(MAGENTA_ANSI + "Índice de Radiación Ultravioleta (UVI): " + colorUVI + " " + RESET_ANSI);
    }
}
