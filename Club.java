
/*
1.º DAM - Programación Ejercicios
Ejercicios Tema 3. Estructuras condicionales

*/
import java.util.Scanner;

public class Club{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
		
		double cuota=500;
		
		double descuento50=cuota/1.50;

		double descuento25=cuota/1.25;
	
		double descuento35=cuota/1.35;

		int edad=0;
		boolean padreSocio=false;
		

	
	

       System.out.println("Dime tu edad");
       edad=Integer.parseInt(lector.nextLine());// pido edad
	   
			   if(edad>65){
				System.out.println("Si tienes "+edad+"años, tu descuento es 50% y el total en euros es :"+descuento50);

				   
			   }else if(edad<=18){
					
					System.out.println("Dime si tu padre es socio (false /true)");
					padreSocio=lector.nextBoolean();// pido edad
					
					
					
					if(padreSocio==true){
			
				    System.out.println("Si tienes "+edad+"años, tienes padres socios y tu descuento es  35 y el total en euros es :"+Math.round(descuento35)+"€");

					}else{
					System.out.println("Si tienes "+edad+"años,no tienes padres socios y tu descuento es 25 y el total en euros es ::"+Math.round(descuento25)+"€");

					}
	
			   }else{
				   					System.out.println("Si tienes "+edad+"años,no tienes descuento. Y el total de importe es  "+cuota);

			   }
		
		      lector.close(); // cierro scanner
		
		
		


    }
}

