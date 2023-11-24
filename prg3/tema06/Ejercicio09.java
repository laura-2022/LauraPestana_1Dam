package com.laurapestana.prg3.tema06;
 import java.util.Scanner;
public class Ejercicio09 {
  
    public Ejercicio09() {
        Scanner scanner = new Scanner(System.in);
    
                  
        System.out.println("Ejercicio 9:");
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.println("Frase con la primera letra en mayúsculas: " + primeraLetraMayuscula(frase));
    
    }

    
        
                private static String primeraLetraMayuscula(String frase) {
                    
                    // TODO Auto-generated method stub
                     return frase.substring(0, 1).toUpperCase() + frase.substring(1);
                }
    
            
    }