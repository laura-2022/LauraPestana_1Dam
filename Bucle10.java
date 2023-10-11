//Escribe un programa que solicite números hasta que se teclee un 0, mostrar la suma de todos los números introducidos

import java.util.Scanner;
public class Bucle10{
   public static void main(String[] args) {
       
        Scanner lector = new Scanner(System.in);
		
		int num;
		int suma=0;
		
        System.out.println("Ingrese  numeros enteros para calcular su suma , pulsa 0 para ver resultado");
    	
		while(true){
		num = lector.nextInt();
			if(num!=0){
					suma+=num;
					
			}else if (num==0){
				 System.out.println("final de programa");
				 
			}
		
			 System.out.println("la suma de todos los numeros es : "+suma);
		}
			
           
		 
	
    
                                         
    
	}
}

     