package com.laurapestana.prg3.tema06;
import java.util.Scanner;
import java.util.Random;

    

    public class Ejercicio24 {
    
        public Ejercicio24() {
           
		// Declarar e inicializar el array V con 50 elementos
        int[] V = llenarArray(50);

        // Calcular el array P
        int[] P = calcularArrayP(V);

        // Imprimir los arrays V y P
        System.out.println(obtenerTextoArray(V, "V"));
        System.out.println(obtenerTextoArray(P, "P"));
    }

    private String obtenerTextoArray(int[] arr, String nombre) {
    	StringBuilder sb = new StringBuilder();
        sb.append("Array ").append(nombre).append(":\n");

        for (int i = 0; i < arr.length; i++) {
            int resultadoParcial = 0;
            for (int j = 0; j <= i; j++) {
                resultadoParcial += arr[j];
            }
            sb.append(nombre).append("(").append(i).append(") = ").append(resultadoParcial).append("\n");
        }

        return sb.toString();
    }

    private int[] calcularArrayP(int[] arrV) {
        int[] arrP = new int[arrV.length];

        for (int i = 0; i < arrV.length; i++) {
            arrP[i] = arrV[0];

            for (int j = 1; j <= i; j++) {
                arrP[i] += arrV[j];
            }
        }

        return arrP;
    }

    private int[] llenarArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1; 
        }
        return arr;
	}	
   /* private int[] llenarArray(int length) {
        int[] arr = new int[length];
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = rnd.nextInt(100); // Rellena con valores aleatorios entre 0 y 99 (puedes ajustar según tus necesidades)
        }
        return arr;
    }
*/

}