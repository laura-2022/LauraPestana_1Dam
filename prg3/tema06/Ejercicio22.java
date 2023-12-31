package com.laurapestana.prg3.tema06;
import java.util.Scanner;
import java.util.Random;



    public class Ejercicio22 {
    
        public Ejercicio22() {
         
                            // Crear un array P de 10 elementos numéricos
                            Scanner scanner = new Scanner(System.in);
                            int[] P = new int[10];
            
                            for (int i = 0; i < 10; i++) {
                                System.out.print("Introduce el elemento " + (i + 1) + " de P: ");
                                P[i] = scanner.nextInt();
                            }
            
                            // Visualizar el contenido de P
                            System.out.print("Contenido de P: ");
                            for (int elemento : P) {
                                System.out.print(elemento + " ");
                            }
                            System.out.println();
            
                            // Crear el array S con elementos mayores de 10 o -1 si son <= 10
                            int[] S = new int[10];
            
                            for (int i = 0; i < 10; i++) {
                                if (P[i] > 10) {
                                    S[i] = P[i];
                                } else {
                                    S[i] = -1;
                                }
                            }
            
                            // Visualizar el contenido de S
                            System.out.print("Contenido de S: ");
                            for (int elemento : S) {
                                System.out.print(elemento + " ");
                            }
                        }
                    
            
                }
            
            