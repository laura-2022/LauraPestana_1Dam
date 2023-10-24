import java.util.Scanner;

public class SalidaFormato9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int presion=0;
		 

        // Solicitar los datos al usuario
        System.out.print("\u001B[44m\u001B[1;30mDatos de la Estación Meteorológica\u001B[0m\n"); // Título con fondo azul y texto gris en negrita

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.println("\u001B[1mFecha:\u001B[0m");
        System.out.print("Día (dd): ");
        int dia = scanner.nextInt();
        System.out.print("Mes (mm): ");
        int mes = scanner.nextInt();
        System.out.print("Año (yyyy): ");
        int año = scanner.nextInt();

        System.out.println("\u001B[1mHora de la medición:\u001B[0m");
        System.out.print("Hora (hh): ");
        int hora = scanner.nextInt();
        System.out.print("Minutos (mm): ");
        int minutos = scanner.nextInt();
        System.out.print("Segundos (ss): ");
        int segundos = scanner.nextInt();

        System.out.print("\u001B[32mVelocidad del Viento (Km/h): \u001B[0m"); // Texto de velocidad de viento en verde
        int velocidadViento = scanner.nextInt();

        System.out.print("\u001B[33mTemperatura (°C): \u001B[0m"); // Texto de temperatura en amarillo
        double temperatura = scanner.nextDouble();

        System.out.print("\u001B[31mProbabilidad de Lluvia (%): \u001B[0m"); // Texto de probabilidad de lluvia en rojo
        int probabilidadLluvia = scanner.nextInt();

        System.out.print("\u001B[35mÍndice de Radiación Ultravioleta (UVI): \u001B[0m"); // Texto de UVI en color fucsia
        int uvi = scanner.nextInt();

        scanner.close();

        // Formatear la fecha
        String fechaFormateada = String.format("%02d/%02d/%04d", dia, mes, año);

        // Formatear la hora de la medida
        String horaFormateada = String.format("%02d:%02d:%02d", hora, minutos, segundos);

        // Mostrar los datos
        System.out.println("\n\u001B[1mDatos de la Estación Meteorológica\u001B[0m:");
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Fecha: " + fechaFormateada);
        System.out.println("Hora de la Medida: " + horaFormateada);

        // Mostrar la velocidad del viento con colores
        String colorViento = velocidadViento < 30 ? "\u001B[32mVerde\u001B[0m" : (velocidadViento <= 60 ? "\u001B[33mAmarillo\u001B[0m" : "\u001B[31mRojo\u001B[0m");
        System.out.println("Velocidad del Viento: " + velocidadViento + " Km/h (" + colorViento + ")");

        // Mostrar la temperatura con colores
        String colorTemperatura = (temperatura < 22) ? "\u001B[34mAzul\u001B[0m" : (temperatura < 27 ? "\u001B[32mVerde\u001B[0m" : (temperatura < 35 ? "\u001B[33mAmarillo\u001B[0m" : "\u001B[31mRojo\u001B[0m"));
        System.out.println("Temperatura: " + String.format("%.2f", temperatura) + " °C (" + colorTemperatura + ")");

        // Mostrar la presión atmosférica
        System.out.println("Presión Atmosférica: " + String.format("%.1f", presion) + " hPa");

        // Mostrar la probabilidad de lluvia con colores
        String colorLluvia = (probabilidadLluvia < 35) ? "\u001B[32mVerde\u001B[0m" : (probabilidadLluvia <= 70 ? "\u001B[33mAmarillo\u001B[0m" : "\u001B[31mRojo\u001B[0m");
        System.out.println("Probabilidad de Lluvia: " + probabilidadLluvia + "% (" + colorLluvia + ")");

        // Mostrar el índice de radiación ultravioleta con colores
   String colorUVI = (uvi <= 2 ? "\u001B[32mVerde\u001B[0m" : (uvi <= 5 ? "\u001B[34mAzul\u001B[0m" : (uvi <= 7 ? "\u001B[33mAmarillo\u001B[0m" : (uvi <= 10 ? "\u001B[31mRojo\u001B[0m" : "\u001B[35mMagenta\u001B[0m"))));
   System.out.println("Índice de Radiación Ultravioleta (UVI): " + uvi + " (" + colorUVI + ")");
    }
}
