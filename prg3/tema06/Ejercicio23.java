package com.laurapestana.prg3.tema06;
import java.util.Scanner;
import java.util.Random;


		/*
 MENU QUE CREE ARRAY, VISUALICE ARRAY, VISUALICE EN POSICION PAR, Y DE LOS MULTIPLOS DE 3
	*/
    

    public class Ejercicio21 {
    
        public Ejercicio21() {
           
            /* Escribe un programa que permita introducir un array P de 10 elementos numéricos, visualizar su
            contenido y crear otro array S con los elementos de P que sean mayores de 10 (cuando los
            elementos sean <=10, se pondrá un -1). Visualizar después el contenido de S.*/
           
                    
            
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
            
            