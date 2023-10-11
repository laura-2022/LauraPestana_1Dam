 /* Escribe un programa que solicite 3 números enteros h, m y s que contengan la hora, minutos y
segundos respectivamente, y compruebe si la hora que indican estos valores es un hora válida*/

import java.util.Scanner;

public class Bucle15{
   public static void main(String[] args) {
       
        Scanner lector = new Scanner(System.in);
	
		
		
		int h=0;
		int m=0;
		int s=0;
		
	
	
		do{
			System.out.println("dame h (de 0 a 23) ");
	
			h=lector.nextInt();
		
			System.out.println("dame m (de 0 a 59)");
			
			m=lector.nextInt();
			
			System.out.println("dame s (de 0 a 59)");
		
			s=lector.nextInt();
			
		
			
			
			if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
                System.out.println("Hora no válida.Ingresa valor en el rango correcto.");
            }

		}while (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) ;
		
		
		  System.out.println("La hora dada es: " + h + ":" + m + ":" + s);
		  lector.close();
	}
	
     
}