/*Escribe un programa que solicite hora, minutos y segundos y la muestre con formato hh:mm:ss.
Por ejemplo, para h=3, m=14 y s=4 deberá mostrar 03:14:04*/

import java.util.Scanner;
public class SalidaFormato2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, ingresa la hora:");
        int horas = sc.nextInt();
        System.out.println("Ingresa los minutos:");
        int minutos = sc.nextInt();
        System.out.println("Ingresa los segundos:");
        int segundos = sc.nextInt();

        // Formatear los valores
        String horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);

        System.out.println("La hora formateada es: " + horaFormateada);
    }
}
