package com.laurapestana.prg3.tema06;
 import java.util.Scanner;
public class Ejercicio13 {
  
    public Ejercicio13() {
        Scanner scanner = new Scanner(System.in);
    
                  
   System.out.println("Ejercicio 11:");
	   
	                // Solicitar las tres cadenas de caracteres
	                System.out.print("Ingresa el nombre: ");
	                String nombre = scanner.nextLine();

	                System.out.print("Ingresa el primer apellido: ");
	                String primerCognom = scanner.nextLine();

	                System.out.print("Ingresa el segundo apellido: ");
	                String segonCognom = scanner.nextLine();

	                // Crear la cadena con el nombre completo
                    String nombreCompleto = nombre + " " + primerCognom + " " + segonCognom;
                    // Mostrar resultados
                    System.out.println("a) Nombre completo:");
                    System.out.println(mostrarNombreCompleto(nombreCompleto));

    
	                System.out.println("\nb) Los 5 primeros caracteres:");
	                System.out.println(mostrarPrimeros5Caracteres(nombreCompleto));
   

	                System.out.println("\nc) Los dos últimos caracteres:");
	                System.out.println(mostrarUltimos2Caracteres(nombreCompleto));
 
	                System.out.println("\nd) Número de ocurrencias del último carácter:");
	                System.out.println(mostrarOcurrenciasUltimoCaracter(nombreCompleto));
 
	                System.out.println("\ne) Cadena con ocurrencias del primer carácter en mayúscula:");
	                System.out.println(mostrarOcurrenciasPrimerCaracterMayuscula(nombreCompleto));
   

	                System.out.println("\nf) Cadena con tres * por delante y por detrás:");
	                System.out.println(mostrarCadenaConAsteriscos(nombreCompleto));

	                System.out.println("\ng) Cadena invertida:");
	                System.out.println(mostrarCadenaInvertida(nombreCompleto));
	            }

                    private static String mostrarNombreCompleto(String nombreCompleto) {
                    StringBuilder resultado = new StringBuilder();
                    resultado.append("Minúscula: ").append(nombreCompleto.toLowerCase()).append("\n");
                    resultado.append("Mayúscula: ").append(nombreCompleto.toUpperCase()).append("\n");
                    resultado.append("Longitud: ").append(nombreCompleto.length());
                    return resultado.toString();
                }

         
	            private static String mostrarPrimeros5Caracteres(String cadena) {
	                StringBuilder resultado = new StringBuilder();
	                if (cadena.length() >= 5) {
	                   resultado.append(cadena.substring(0, 5));
	                } else {
	                    resultado.append("La longitud de la cadena es menor a 5 caracteres.");
	                }
	                return resultado.toString();
	            }
     
	            private static String mostrarUltimos2Caracteres(String cadena) {
	                StringBuilder resultado = new StringBuilder();
	                if (cadena.length() >= 2) {
	                    resultado.append(cadena.substring(cadena.length() - 2));
	                } else {
	                    resultado.append("La longitud de la cadena es menor a 2 caracteres.");
	                }
	                return resultado.toString();
	            }
  
	            private static int mostrarOcurrenciasUltimoCaracter(String cadena) {
	            	char ultimoCaracter = cadena.charAt(cadena.length() - 1);
	                int contador = 0;

	                for (char letra : cadena.toCharArray()) {
	                    if (letra == ultimoCaracter) {
	                        contador++;
                        }
                    }
                    for (int i = 0; i < cadena.length(); i++) {
                        if (cadena.charAt(i) == ultimoCaracter) {
                        contador++;
                     }
	                }

	                return contador;
	            }
                //la primera letra debe aparecer en toda la frase como matuscula
	            private static String mostrarOcurrenciasPrimerCaracterMayuscula(String cadena) {
                    StringBuilder resultado = new StringBuilder();
                    
                    if (cadena.length() > 0) {
                        char primerCaracter=cadena.charAt(0);
                        primerCaracter = Character.toUpperCase(primerCaracter);
                        resultado.append(primerCaracter);  // Agregamos la primera letra convertida a mayúscula al resultado
                
                        // Agregamos el resto de la cadena sin modificar
                        resultado.append(cadena.substring(1));
                    } else {
                        resultado.append("La cadena está vacía.");
                    }
                
                    return resultado.toString();
                }
 
	            private static String mostrarCadenaConAsteriscos(String cadena) {
	                return new StringBuilder("***").append(cadena).append("***").toString();
	            }

	            private static String mostrarCadenaInvertida(String cadena) {
	                return new StringBuilder(cadena).reverse().toString();
                }
 }
        
    
