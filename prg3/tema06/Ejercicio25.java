package com.laurapestana.prg3.tema06;
import java.util.Scanner;
import java.util.Random;


/*
 * Escribe un programa que permita, a partir de un array V de 50 elementos, crear e imprimir un
array P con los elementos de V de contenido par. Si no hubiera, que lo indique mediante un
mensaje.
*/

public class Ejercicio25 {
    public static final int LONGITUD = 50;

    public Ejercicio25() {
        int[] arrayV = rellenarArray();
        int[] arrayP = imprimirArrayP(arrayV);

        // Imprimo el array P con Arrays.toString()
        if (arrayP.length == 0) {
            System.out.println("No hay elementos pares en el array.");
        } else {
            System.out.println("Array P (elementos pares): " + Arrays.toString(arrayP));
        }
    }

    // Relleno el array con función Math.random()
    private int[] rellenarArray() {
        int[] arrayV = new int[LONGITUD];
        for (int i = 0; i < arrayV.length; i++) {
            arrayV[i] = (int) (Math.random() * 100);
        }
        return arrayV;
    }

    // Imprimo el array P rellenado con los números pares
    private int[] imprimirArrayP(int[] arrayV) {
        int contador = 0;
        
        // Cuento la cantidad de elementos pares
        for (int i = 0; i < arrayV.length; i++) {
            if (arrayV[i] % 2 == 0) {
                contador++;
            }
        }

        // Creo el array P con la longitud exacta necesaria
        int[] arrayP = new int[contador];
        contador = 0; // Reinicio el contador

        // Relleno el array P con los números pares
        for (int i = 0; i < arrayV.length; i++) {
            if (arrayV[i] % 2 == 0) {
                arrayP[contador] = arrayV[i];
                contador++;
            }
        }

        return arrayP;
    }
}

