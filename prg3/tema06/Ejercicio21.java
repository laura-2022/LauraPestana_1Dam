package com.laurapestana.prg3.tema06;
import java.util.Scanner;
import java.util.Random;


		/*
 MENU QUE CREE ARRAY, VISUALICE ARRAY, VISUALICE EN POSICION PAR, Y DE LOS MULTIPLOS DE 3
	*/
    

    public class Ejercicio21 {
    
        public Ejercicio21() {
            Scanner scanner = new Scanner(System.in);
            int[] vector = new int[10];
            int opcion;
    
            do {
                System.out.println("MENU PRINCIPAL");
                System.out.println("===============");
                System.out.println("1.-Rellenar array.\r\n" + "2.-Visualizar contenido del array\r\n"
                        + "3.-Visualizar contenido par.\r\n" + "4.-Visualizar contenido múltiplo de 3\r\n"
                        + "0.-Salir del menú.\r\n" + "Selecciona una opción:.");
    
                opcion = scanner.nextInt();
    
                switch (opcion) {
                case 1:
                    vector = crearArray();
                    System.out.println("Array creado correctamente.");
                    break;
                case 2:
                    String contenidoArray = visualizarArray(vector);
                    System.out.println(contenidoArray);
                    break;
                case 3:
                    int[] posicionesPares = visualizarParell(vector);
                    System.out.println("Posiciones con valores pares: " + Arrays.toString(posicionesPares));
                    break;
                case 4:
                    int[] posicionesMultiplo3 = visualizarMultiple3(vector);
                    System.out.println("Posiciones con valores múltiplo de 3: " + Arrays.toString(posicionesMultiplo3));
                    break;
                case 0:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
    
        } while (opcion != 0);
    
        scanner.close();
    }
    
        public static int[] crearArray() {
            int[] vector = new int[10];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = (int) (Math.random() * 51);
            }
            return vector;
        }
    
        public static String visualizarArray(int[] vector) {
            StringBuilder resultado = new StringBuilder("Contenido del array: ");
            for (int i = 0; i < vector.length; i++) {
                resultado.append(vector[i]).append(" ");
            }
            return resultado.toString().trim();
        }
    
    
        public static int[] visualizarParell(int[] vector) {
            System.out.println("Posición de los elementos con valor par:");
            int[] pares = new int[vector.length / 2];
            int count = 0;
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] % 2 == 0) {
                    System.out.println("Posición " + i + ": " + vector[i]);
                    pares[count++] = i;
                }
            }
            return pares;
        }
    
        public static int[] visualizarMultiple3(int[] vector) {
            int countMultiplo3 = 0;
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] % 3 == 0) {
                    countMultiplo3++;
                }
            }
            int[] posicionesMultiplo3 = new int[countMultiplo3];
            int index = 0;
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] % 3 == 0) {
                    posicionesMultiplo3[index++] = i;
                }
            }
            return posicionesMultiplo3;
        }
    }
    