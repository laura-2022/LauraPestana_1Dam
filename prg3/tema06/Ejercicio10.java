package com.laurapestana.prg3.tema06;
 import java.util.Scanner;
public class Ejercicio10 {
  
    public Ejercicio10() {
        Scanner scanner = new Scanner(System.in);

		      
	
		        System.out.println("Ejercicio 10:");
		        System.out.print("Ingresa una palabra: ");
		        String palabra = scanner.nextLine().toLowerCase();
		       
		        System.out.println(palabra+" : " +palindromo(palabra));

		}

		private static String palindromo(String palabra) {
				
		// TODO Auto-generated method stub
		String invertida = "";
		char letra;
			for(int i=palabra.length()-1;i>=0;i--) {
			    	  letra=palabra.charAt(i);
			    	  invertida=invertida+letra;
			    }
		     if(palabra.equals(invertida)) {
			    	 return "es palindommo";
			 }else {
			    	  return "No es palindommo"; 
			}
        }    

}
    