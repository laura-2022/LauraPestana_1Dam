package com.laurapestana.prg3.tema06;
 import java.util.Scanner;
import java.util.Random;

public class Ejercicio20 {
	static Random r = new Random();

	public Ejercicio20() {
		/*
 Genera un método al que le pasaremos un array y un número y nos devuelva si ese número está
en el array.*/
		
		Scanner sc = new Scanner(System.in);

        // Pide al usuario el tamaño del array
        System.out.println("Ingrese la longitud del array: ");
        int longitud = sc.nextInt();

        // Crea el array con la longitud proporcionada
        int array[] = new int[longitud];

        // Pide al usuario que ingrese los valores para el array
        System.out.println("Ingresamos los elementos del array de forma aleatoria:");
        for (int i = 0; i < longitud; i++) {
            array[i] = randomInt(0, 100);
            System.out.println(array[i]);
        }

        // Pide al usuario el número a verificar
        System.out.println("Diga el  número a verificar: ");
        int numDado = sc.nextInt();

        // Verifica si el número está en el array
        System.out.println("¿El número está en el array? " + verificarNumEnArray(array, numDado));
    }

    private boolean verificarNumEnArray(int[] array, int numDado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numDado) {
                return true;
            }
        }
        return false;
    }
    public static int randomInt(int min, int max) {

		int resultado = r.nextInt(max - min + 1) + min; // puedo poner return antes del r.ne..
		return resultado;
	}
}